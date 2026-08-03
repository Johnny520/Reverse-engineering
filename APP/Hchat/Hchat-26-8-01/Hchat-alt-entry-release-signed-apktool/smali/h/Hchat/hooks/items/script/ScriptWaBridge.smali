.class public final Lh/Hchat/hooks/items/script/ScriptWaBridge;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8

.field private static final Companion:Leb/z0;

.field public static final SCRIPT_CONTACT_READ_ATTEMPTS:I = 0x5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final SCRIPT_CONTACT_READ_DELAY_MS:J = 0xfaL
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final VIDEO_DOWNLOAD_TIMEOUT_MS:J = 0xea60L
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final atPattern:Ljava/util/regex/Pattern;

.field private final bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

.field private final callbackSeq:Ljava/util/concurrent/atomic/AtomicLong;

.field private currentPluginDir:Ljava/io/File;

.field private currentPluginName:Ljava/lang/String;

.field private final durationCodec$delegate:Lsf/c;

.field private final httpClients:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lokhttp3/OkHttpClient;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Leb/z0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->Companion:Leb/z0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lh/Hchat/hooks/items/script/ScriptPluginBridge;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 8
    .line 9
    const-string p1, "\\[AtWx=([^\\]]+)]"

    .line 10
    .line 11
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->atPattern:Ljava/util/regex/Pattern;

    .line 19
    .line 20
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    const-wide/16 v0, 0x1

    .line 23
    .line 24
    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callbackSeq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpClients:Ljava/util/Map;

    .line 39
    .line 40
    new-instance p1, Lbi/c;

    .line 41
    .line 42
    const/16 v0, 0x13

    .line 43
    .line 44
    invoke-direct {p1, v0}, Lbi/c;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lsf/d;->g:Lsf/d;

    .line 48
    .line 49
    invoke-static {v0, p1}, Lbe/h;->G(Lsf/d;Lfg/a;)Lsf/c;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->durationCodec$delegate:Lsf/c;

    .line 54
    .line 55
    return-void
.end method

.method public static synthetic A(Leb/w0;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal$lambda$5(Lfg/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B(Lh/Hchat/hooks/items/script/ScriptWaBridge;JLa1/d;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->delay$lambda$1(Lh/Hchat/hooks/items/script/ScriptWaBridge;JLjava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->download$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic D(Lh/Hchat/hooks/items/script/ScriptWaBridge;Log/f;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->unescapeXmlText$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Log/f;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic E(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImages$lambda$1(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareMiniProgram$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic G(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendEmoji$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic H(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/Exception;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal$lambda$1(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/Exception;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic I(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendFavorite$lambda$1(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic J(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->get$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic K(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p1, p0, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImage$lambda$1(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic L(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImages$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic M(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/io/File;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal$lambda$0(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/io/File;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic N()Lme/yun/silk/SilkCodec;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->durationCodec_delegate$lambda$0()Lme/yun/silk/SilkCodec;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareVideo$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic P(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImg$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic Q(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideo$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendOriginalImage$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final applyHeaders(Lokhttp3/Request$Builder;Ljava/util/Map;)Lokhttp3/Request$Builder;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Request$Builder;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lokhttp3/Request$Builder;"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    const-string v2, "Content-Type"

    .line 34
    .line 35
    invoke-static {v1, v2}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p1, v1, v0}, Lokhttp3/Request$Builder;->header(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-object p1
.end method

.method private final async(Lfg/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callbackSeq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-string v2, "script_http_"

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-instance v0, Leb/t0;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {v0, p1, p0, v2}, Leb/t0;-><init>(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Lo8/j;->d(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance v1, Ljava/lang/Thread;

    .line 37
    .line 38
    new-instance v2, Leb/t0;

    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {v2, p1, p0, v3}, Leb/t0;-><init>(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;I)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method private static final async$lambda$0(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Lsf/f;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, v0

    .line 13
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "\u5f02\u6b65\u4efb\u52a1\u5931\u8d25: "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method private static final async$lambda$1(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    goto :goto_0

    .line 6
    :catchall_0
    move-exception p0

    .line 7
    new-instance v0, Lsf/f;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    move-object p0, v0

    .line 13
    :goto_0
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v1, "\u5f02\u6b65\u4efb\u52a1\u5931\u8d25: "

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendFile$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final buildPostBody(Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->normalizeMap(Ljava/util/Map;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, ""

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_0
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Ljava/lang/Iterable;

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v3, v0

    .line 36
    check-cast v3, Ljava/util/Map$Entry;

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/String;

    .line 43
    .line 44
    const-string v4, "Content-Type"

    .line 45
    .line 46
    invoke-static {v3, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object v0, v2

    .line 54
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    move-object v2, p2

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    :cond_3
    if-nez v2, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move-object v1, v2

    .line 69
    :goto_1
    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 70
    .line 71
    const-string v0, "application/json"

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-static {p2, v1, p2, v0, v2}, Lbc/e;->u(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_6

    .line 79
    .line 80
    new-instance p2, Lorg/json/JSONObject;

    .line 81
    .line 82
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_5

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, Ljava/util/Map$Entry;

    .line 104
    .line 105
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    move-object v0, p1

    .line 134
    check-cast v0, Ljava/lang/Iterable;

    .line 135
    .line 136
    new-instance v4, Le9/h;

    .line 137
    .line 138
    const/16 p1, 0x14

    .line 139
    .line 140
    invoke-direct {v4, p1}, Le9/h;-><init>(I)V

    .line 141
    .line 142
    .line 143
    const/16 v5, 0x1e

    .line 144
    .line 145
    const-string v1, "&"

    .line 146
    .line 147
    const/4 v2, 0x0

    .line 148
    const/4 v3, 0x0

    .line 149
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    return-object p1
.end method

.method private static final buildPostBody$lambda$1(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v1, "="

    .line 25
    .line 26
    invoke-static {v0, v1, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static synthetic c(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->delay$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final callAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    array-length v2, v1

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_2

    .line 17
    .line 18
    aget-object v5, v1, v4

    .line 19
    .line 20
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-static {v6, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    array-length v6, v6

    .line 38
    if-nez v6, :cond_0

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_0
    move v6, v3

    .line 45
    :goto_1
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v5, v0

    .line 60
    :goto_2
    if-eqz v5, :cond_3

    .line 61
    .line 62
    invoke-virtual {v5, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_4

    .line 67
    :cond_3
    move-object p1, v0

    .line 68
    goto :goto_4

    .line 69
    :goto_3
    new-instance p2, Lsf/f;

    .line 70
    .line 71
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object p1, p2

    .line 75
    :goto_4
    nop

    .line 76
    instance-of p2, p1, Lsf/f;

    .line 77
    .line 78
    if-eqz p2, :cond_4

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_4
    move-object v0, p1

    .line 82
    :goto_5
    return-object v0
.end method

.method private final callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    array-length v2, v1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    const/4 v5, 0x0

    .line 18
    if-ge v4, v2, :cond_2

    .line 19
    .line 20
    aget-object v6, v1, v4

    .line 21
    .line 22
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v7

    .line 26
    invoke-static {v7, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    array-length v7, v7

    .line 40
    if-nez v7, :cond_0

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_0
    move v7, v3

    .line 47
    :goto_1
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v6, v5

    .line 62
    :goto_2
    if-eqz v6, :cond_3

    .line 63
    .line 64
    invoke-virtual {v6, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :cond_3
    if-nez v5, :cond_4

    .line 75
    .line 76
    move-object v5, v0

    .line 77
    goto :goto_4

    .line 78
    :goto_3
    new-instance v5, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v5, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    :goto_4
    instance-of p1, v5, Lsf/f;

    .line 84
    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_5
    move-object v0, v5

    .line 89
    :goto_5
    check-cast v0, Ljava/lang/String;

    .line 90
    .line 91
    return-object v0
.end method

.method public static synthetic d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareFile$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final defaultContentType(Ljava/util/Map;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    move-object v2, v0

    .line 23
    check-cast v2, Ljava/util/Map$Entry;

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/lang/String;

    .line 30
    .line 31
    const-string v3, "Content-Type"

    .line 32
    .line 33
    invoke-static {v2, v3}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v0, v1

    .line 41
    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    move-object v1, p1

    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    :cond_2
    if-eqz v1, :cond_4

    .line 53
    .line 54
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    return-object v1

    .line 62
    :cond_4
    :goto_1
    const-string p1, "application/x-www-form-urlencoded; charset=UTF-8"

    .line 63
    .line 64
    return-object p1
.end method

.method private static final delay$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    new-instance v0, Lsf/f;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "[Hchat:Script] \u5ef6\u8fdf\u4efb\u52a1\u5931\u8d25: "

    .line 25
    .line 26
    invoke-static {v1, v0, p1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "\u5ef6\u8fdf\u4efb\u52a1\u5931\u8d25: "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method private static final delay$lambda$1(Lh/Hchat/hooks/items/script/ScriptWaBridge;JLjava/lang/Runnable;)V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    move-wide p1, v0

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/Thread;->sleep(J)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    new-instance p2, Lsf/f;

    .line 19
    .line 20
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p1, p2

    .line 24
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance p2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p3, "\u5ef6\u8fdf\u4efb\u52a1\u5931\u8d25: "

    .line 39
    .line 40
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method private static final download$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-direct/range {p1 .. p6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadFile(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    return-object p0
.end method

.method private final downloadFile(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;J)",
            "Ljava/io/File;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_8

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_8

    .line 11
    .line 12
    :cond_0
    if-eqz p2, :cond_8

    .line 13
    .line 14
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto/16 :goto_8

    .line 21
    .line 22
    :cond_1
    :try_start_0
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->resolveDownloadTarget(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_5

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_2
    :goto_0
    new-instance v1, Lokhttp3/Request$Builder;

    .line 48
    .line 49
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->normalizeMap(Ljava/util/Map;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-direct {p0, p1, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->applyHeaders(Lokhttp3/Request$Builder;Ljava/util/Map;)Lokhttp3/Request$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-direct {p0, p4, p5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpClient(J)Lokhttp3/OkHttpClient;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p3, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-interface {p1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    :try_start_1
    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    new-instance p4, Ljava/io/BufferedInputStream;

    .line 91
    .line 92
    invoke-virtual {p3}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-direct {p4, p3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 97
    .line 98
    .line 99
    :try_start_2
    new-instance p3, Ljava/io/FileOutputStream;

    .line 100
    .line 101
    invoke-direct {p3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 102
    .line 103
    .line 104
    const/16 p5, 0x2000

    .line 105
    .line 106
    :try_start_3
    new-array p5, p5, [B

    .line 107
    .line 108
    :goto_1
    invoke-virtual {p4, p5}, Ljava/io/InputStream;->read([B)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-gtz v1, :cond_3

    .line 113
    .line 114
    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 115
    .line 116
    .line 117
    :try_start_4
    invoke-virtual {p3}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 118
    .line 119
    .line 120
    :try_start_5
    invoke-virtual {p4}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 121
    .line 122
    .line 123
    :try_start_6
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 124
    .line 125
    .line 126
    goto :goto_6

    .line 127
    :catchall_1
    move-exception p2

    .line 128
    goto :goto_4

    .line 129
    :catchall_2
    move-exception p2

    .line 130
    goto :goto_3

    .line 131
    :catchall_3
    move-exception p2

    .line 132
    goto :goto_2

    .line 133
    :cond_3
    const/4 v2, 0x0

    .line 134
    :try_start_7
    invoke-virtual {p3, p5, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :goto_2
    :try_start_8
    throw p2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 139
    :catchall_4
    move-exception p5

    .line 140
    :try_start_9
    invoke-static {p3, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw p5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 144
    :goto_3
    :try_start_a
    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 145
    :catchall_5
    move-exception p3

    .line 146
    :try_start_b
    invoke-static {p4, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw p3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 150
    :cond_4
    :try_start_c
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 151
    .line 152
    .line 153
    :cond_5
    move-object p2, v0

    .line 154
    goto :goto_6

    .line 155
    :goto_4
    :try_start_d
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 156
    :catchall_6
    move-exception p3

    .line 157
    :try_start_e
    invoke-static {p1, p2}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    throw p3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 161
    :goto_5
    new-instance p2, Lsf/f;

    .line 162
    .line 163
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :goto_6
    invoke-static {p2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    if-eqz p1, :cond_6

    .line 171
    .line 172
    iget-object p3, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    new-instance p4, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string p5, "\u4e0b\u8f7d\u5931\u8d25: "

    .line 181
    .line 182
    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p3, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_6
    instance-of p1, p2, Lsf/f;

    .line 196
    .line 197
    if-eqz p1, :cond_7

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_7
    move-object v0, p2

    .line 201
    :goto_7
    check-cast v0, Ljava/io/File;

    .line 202
    .line 203
    :cond_8
    :goto_8
    return-object v0
.end method

.method private static final downloadImage$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;)Lsf/n;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, p2, v0}, Lzb/b;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final downloadImage$lambda$1(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p2, p3}, Lzb/b;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final downloadImages$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;)Lsf/n;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p1, v0, p2}, Lzb/b;->f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p0
.end method

.method private static final downloadImages$lambda$1(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/List;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 4
    .line 5
    invoke-virtual {p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p3, p2}, Lzb/b;->f(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final downloadImg$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->imageDownloadRequest(Ljava/lang/Object;)Leb/a1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p1, "Invalid image message"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p0}, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;->onError(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0

    .line 22
    :cond_1
    iget-object v2, p1, Leb/a1;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, Leb/a1;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p1, Leb/a1;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget v6, p1, Leb/a1;->d:I

    .line 29
    .line 30
    iget v7, p1, Leb/a1;->e:I

    .line 31
    .line 32
    move-object v1, p0

    .line 33
    move-object v5, p3

    .line 34
    invoke-direct/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImgInternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 47
    .line 48
    .line 49
    move-result-wide v1

    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    cmp-long p1, v1, v3

    .line 53
    .line 54
    if-lez p1, :cond_2

    .line 55
    .line 56
    if-eqz p2, :cond_3

    .line 57
    .line 58
    invoke-interface {p2, p0}, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;->onSuccess(Ljava/io/File;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    if-eqz p2, :cond_3

    .line 63
    .line 64
    new-instance p0, Ljava/lang/Exception;

    .line 65
    .line 66
    const-string p1, "Image download failed"

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, p0}, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;->onError(Ljava/lang/Exception;)V

    .line 72
    .line 73
    .line 74
    :cond_3
    :goto_0
    return-object v0
.end method

.method private final downloadImgInternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p6

    .line 4
    .line 5
    const-string v8, " "

    .line 6
    .line 7
    const-string v9, "downloadImg\u5931\u8d25: CDN\u4e0b\u8f7d\u8d85\u65f6 fileType="

    .line 8
    .line 9
    const-string v10, "downloadImg\u5931\u8d25: CDN\u4efb\u52a1\u63d0\u4ea4\u5931\u8d25 fileType="

    .line 10
    .line 11
    const-string v2, "downloadImg\u5931\u8d25: \u65e0\u6cd5\u6e05\u7406\u65e7\u6587\u4ef6 -> "

    .line 12
    .line 13
    const-string v3, "downloadImg\u5931\u8d25: \u56fe\u7247API\u672a\u5c31\u7eea -> "

    .line 14
    .line 15
    const-string v4, "downloadImg\u5931\u8d25: "

    .line 16
    .line 17
    const/4 v11, 0x0

    .line 18
    move-object/from16 v5, p2

    .line 19
    .line 20
    :try_start_0
    invoke-direct {v1, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->normalizeDownloadUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v5, v11

    .line 32
    :goto_0
    if-eqz v5, :cond_4

    .line 33
    .line 34
    move-object/from16 v6, p1

    .line 35
    .line 36
    move-object/from16 v7, p4

    .line 37
    .line 38
    invoke-direct {v1, v7, v6, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->targetFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object v12

    .line 42
    invoke-direct {v1, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->isHttpUrl(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    const-string v13, " -> "

    .line 47
    .line 48
    const/16 v14, 0x78

    .line 49
    .line 50
    if-eqz v6, :cond_5

    .line 51
    .line 52
    :try_start_1
    sget-object v0, Lzb/b;->a:Lsf/i;

    .line 53
    .line 54
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-static {v12, v5, v0}, Lzb/b;->g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-wide/16 v6, 0x0

    .line 63
    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_1

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    cmp-long v3, v9, v6

    .line 77
    .line 78
    if-gtz v3, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :cond_1
    :goto_1
    invoke-static {v14, v5}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    new-instance v9, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->logDownload(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    if-eqz v2, :cond_4

    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-eqz v3, :cond_3

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/io/File;->length()J

    .line 122
    .line 123
    .line 124
    move-result-wide v3

    .line 125
    cmp-long v3, v3, v6

    .line 126
    .line 127
    if-lez v3, :cond_3

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    const/4 v0, 0x0

    .line 131
    :goto_2
    if-eqz v0, :cond_4

    .line 132
    .line 133
    goto/16 :goto_8

    .line 134
    .line 135
    :cond_4
    :goto_3
    move-object v2, v11

    .line 136
    goto/16 :goto_8

    .line 137
    .line 138
    :cond_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_6

    .line 143
    .line 144
    iget-object v4, v4, Lj8/p;->a:Lj8/n;

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_6
    move-object v4, v11

    .line 148
    :goto_4
    if-nez v4, :cond_7

    .line 149
    .line 150
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v2, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->logDownload(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_7
    invoke-virtual {v12}, Ljava/io/File;->exists()Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    if-eqz v3, :cond_8

    .line 175
    .line 176
    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_8

    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    new-instance v3, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->logDownload(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_8
    if-nez p3, :cond_9

    .line 203
    .line 204
    const-string v2, ""

    .line 205
    .line 206
    :goto_5
    move-object v3, v5

    .line 207
    goto :goto_6

    .line 208
    :cond_9
    move-object/from16 v2, p3

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :goto_6
    :try_start_2
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v5

    .line 215
    const/4 v7, 0x0

    .line 216
    move-object v6, v4

    .line 217
    move-object v4, v2

    .line 218
    move-object v2, v6

    .line 219
    move/from16 v6, p5

    .line 220
    .line 221
    invoke-virtual/range {v2 .. v7}, Lj8/n;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj8/l;)Z

    .line 222
    .line 223
    .line 224
    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 225
    const-string v5, " url="

    .line 226
    .line 227
    const-string v7, " totalLen="

    .line 228
    .line 229
    if-nez v4, :cond_a

    .line 230
    .line 231
    :try_start_3
    invoke-virtual {v2}, Lj8/n;->c()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-static {v14, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    new-instance v9, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->logDownload(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :cond_a
    const-wide/32 v14, 0xea60

    .line 285
    .line 286
    .line 287
    invoke-direct {v1, v12, v14, v15}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->waitDownloadedFile(Ljava/io/File;J)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    if-nez v4, :cond_b

    .line 292
    .line 293
    invoke-virtual {v2}, Lj8/n;->c()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    const/16 v4, 0x78

    .line 298
    .line 299
    invoke-static {v4, v3}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    new-instance v10, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->logDownload(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 344
    .line 345
    .line 346
    move-object v12, v11

    .line 347
    :cond_b
    move-object v2, v12

    .line 348
    goto :goto_8

    .line 349
    :goto_7
    new-instance v2, Lsf/f;

    .line 350
    .line 351
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    :goto_8
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_c

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    const-string v4, "downloadImg\u5f02\u5e38: "

    .line 373
    .line 374
    invoke-static {v4, v3, v8, v0}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-direct {v1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->logDownload(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_c
    instance-of v0, v2, Lsf/f;

    .line 382
    .line 383
    if-eqz v0, :cond_d

    .line 384
    .line 385
    goto :goto_9

    .line 386
    :cond_d
    move-object v11, v2

    .line 387
    :goto_9
    check-cast v11, Ljava/io/File;

    .line 388
    .line 389
    return-object v11
.end method

.method public static synthetic downloadImgInternal$default(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Ljava/io/File;
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x20

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move v5, p5

    .line 12
    move v6, p6

    .line 13
    invoke-direct/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImgInternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static final downloadVideo$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)Lsf/n;
    .locals 7

    .line 1
    new-instance v0, Leb/c1;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    move-object p1, v1

    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    move-object v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    move-object v2, p2

    .line 13
    :goto_0
    if-nez p3, :cond_2

    .line 14
    .line 15
    move-object v3, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_2
    move-object v3, p3

    .line 18
    :goto_1
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p1

    .line 22
    invoke-direct/range {v0 .. v6}, Leb/c1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/io/File;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, p4, p5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal(Leb/c1;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 29
    .line 30
    return-object p0
.end method

.method private static final downloadVideo$lambda$1(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->videoDownloadRequest(Ljava/lang/Object;)Leb/c1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 12
    .line 13
    const-string p1, "Invalid video message"

    .line 14
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2, p0}, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;->onError(Ljava/lang/Exception;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-object v0

    .line 22
    :cond_1
    invoke-direct {p0, p1, p3, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal(Leb/c1;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method private final downloadVideoInternal(Leb/c1;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    new-instance v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v1, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callbackSeq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    const-string v2, "script_video_download_timeout_"

    .line 18
    .line 19
    invoke-static {v4, v5, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v2, Leb/w0;

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    move-object/from16 v6, p3

    .line 38
    .line 39
    invoke-direct/range {v2 .. v7}, Leb/w0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;I)V

    .line 40
    .line 41
    .line 42
    move-object v8, v2

    .line 43
    new-instance v2, Leb/w0;

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    invoke-direct/range {v2 .. v7}, Leb/w0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;I)V

    .line 47
    .line 48
    .line 49
    iget-object v3, v0, Leb/c1;->a:Ljava/lang/String;

    .line 50
    .line 51
    iget-wide v6, v0, Leb/c1;->d:J

    .line 52
    .line 53
    move-object/from16 v9, p2

    .line 54
    .line 55
    invoke-direct {v1, v9, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->videoTargetFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 60
    .line 61
    .line 62
    move-result-object v9

    .line 63
    if-eqz v9, :cond_0

    .line 64
    .line 65
    invoke-virtual {v9}, Ljava/io/File;->isDirectory()Z

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    if-nez v10, :cond_0

    .line 70
    .line 71
    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    .line 72
    .line 73
    .line 74
    :cond_0
    iget-object v9, v0, Leb/c1;->e:Ljava/io/File;

    .line 75
    .line 76
    const/4 v10, 0x0

    .line 77
    const-wide/16 v11, 0x0

    .line 78
    .line 79
    if-eqz v9, :cond_4

    .line 80
    .line 81
    :try_start_0
    invoke-virtual {v9}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v3}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-static {v0, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    move-object v3, v9

    .line 96
    goto :goto_0

    .line 97
    :cond_1
    invoke-static {v9, v3}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    new-instance v3, Lsf/f;

    .line 103
    .line 104
    invoke-direct {v3, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :goto_0
    instance-of v0, v3, Lsf/f;

    .line 108
    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object v10, v3

    .line 113
    :goto_1
    check-cast v10, Ljava/io/File;

    .line 114
    .line 115
    if-eqz v10, :cond_3

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/io/File;->length()J

    .line 124
    .line 125
    .line 126
    move-result-wide v3

    .line 127
    cmp-long v0, v3, v11

    .line 128
    .line 129
    if-lez v0, :cond_3

    .line 130
    .line 131
    invoke-virtual {v8, v10}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    .line 137
    .line 138
    const-string v3, "Video copy failed"

    .line 139
    .line 140
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    goto/16 :goto_3

    .line 147
    .line 148
    :cond_4
    iget-object v9, v0, Leb/c1;->b:Ljava/lang/String;

    .line 149
    .line 150
    invoke-direct {v1, v9}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->normalizeDownloadUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    invoke-static {v14}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_5

    .line 159
    .line 160
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 161
    .line 162
    const-string v3, "Video download URL is empty"

    .line 163
    .line 164
    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_5
    invoke-direct {v1, v14}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->isHttpUrl(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v9, :cond_9

    .line 176
    .line 177
    iget-object v9, v0, Leb/c1;->c:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    if-eqz v9, :cond_9

    .line 184
    .line 185
    const/4 v0, 0x1

    .line 186
    invoke-static {v3, v14, v0}, Lzb/b;->g(Ljava/io/File;Ljava/lang/String;Z)Ljava/io/File;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_7

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_7

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 199
    .line 200
    .line 201
    move-result-wide v3

    .line 202
    cmp-long v3, v3, v11

    .line 203
    .line 204
    if-lez v3, :cond_7

    .line 205
    .line 206
    cmp-long v3, v6, v11

    .line 207
    .line 208
    if-lez v3, :cond_6

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 211
    .line 212
    .line 213
    move-result-wide v3

    .line 214
    cmp-long v3, v3, v6

    .line 215
    .line 216
    if-ltz v3, :cond_7

    .line 217
    .line 218
    :cond_6
    invoke-virtual {v8, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_7
    if-eqz v0, :cond_8

    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 225
    .line 226
    .line 227
    :cond_8
    new-instance v0, Ljava/lang/Exception;

    .line 228
    .line 229
    const-string v3, "Video download failed"

    .line 230
    .line 231
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    return-void

    .line 238
    :cond_9
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    if-eqz v6, :cond_a

    .line 243
    .line 244
    iget-object v10, v6, Lj8/p;->c:Lbb/b;

    .line 245
    .line 246
    :cond_a
    if-nez v10, :cond_b

    .line 247
    .line 248
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 249
    .line 250
    const-string v3, "Video API is not ready"

    .line 251
    .line 252
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_b
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    if-eqz v6, :cond_c

    .line 264
    .line 265
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 266
    .line 267
    .line 268
    move-result v6

    .line 269
    if-nez v6, :cond_c

    .line 270
    .line 271
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 272
    .line 273
    const-string v3, "Unable to replace existing video file"

    .line 274
    .line 275
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_c
    if-eqz v4, :cond_d

    .line 283
    .line 284
    new-instance v6, La1/d;

    .line 285
    .line 286
    const/16 v7, 0xa

    .line 287
    .line 288
    invoke-direct {v6, v1, v7, v2}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    const-wide/32 v11, 0xea60

    .line 292
    .line 293
    .line 294
    invoke-virtual {v4, v5, v11, v12, v6}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 295
    .line 296
    .line 297
    goto :goto_2

    .line 298
    :cond_d
    new-instance v4, Ljava/lang/Thread;

    .line 299
    .line 300
    new-instance v6, La1/a;

    .line 301
    .line 302
    const/16 v7, 0x9

    .line 303
    .line 304
    invoke-direct {v6, v2, v7}, La1/a;-><init>(Ljava/lang/Object;I)V

    .line 305
    .line 306
    .line 307
    invoke-direct {v4, v6, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Thread;->start()V

    .line 311
    .line 312
    .line 313
    :goto_2
    iget-object v15, v0, Leb/c1;->c:Ljava/lang/String;

    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v16

    .line 319
    new-instance v3, Leb/d1;

    .line 320
    .line 321
    invoke-direct {v3, v0, v2, v8}, Leb/d1;-><init>(Leb/c1;Leb/w0;Leb/w0;)V

    .line 322
    .line 323
    .line 324
    iget-object v0, v10, Lbb/b;->d:Ljava/lang/Object;

    .line 325
    .line 326
    move-object v13, v0

    .line 327
    check-cast v13, Lj8/n;

    .line 328
    .line 329
    new-instance v0, Landroidx/lifecycle/x;

    .line 330
    .line 331
    const/16 v4, 0x1b

    .line 332
    .line 333
    invoke-direct {v0, v3, v4}, Landroidx/lifecycle/x;-><init>(Ljava/lang/Object;I)V

    .line 334
    .line 335
    .line 336
    const/16 v17, 0x4

    .line 337
    .line 338
    move-object/from16 v18, v0

    .line 339
    .line 340
    invoke-virtual/range {v13 .. v18}, Lj8/n;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILj8/l;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-nez v0, :cond_e

    .line 345
    .line 346
    new-instance v0, Ljava/lang/Exception;

    .line 347
    .line 348
    const-string v3, "Video download task submission failed"

    .line 349
    .line 350
    invoke-direct {v0, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v2, v0}, Leb/w0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    :cond_e
    :goto_3
    return-void
.end method

.method private static final downloadVideoInternal$lambda$0(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/io/File;)Lsf/n;
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lo8/j;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-eqz p3, :cond_1

    .line 18
    .line 19
    invoke-interface {p3, p4}, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;->onSuccess(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final downloadVideoInternal$lambda$1(Ljava/util/concurrent/atomic/AtomicBoolean;Lo8/j;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/Exception;)Lsf/n;
    .locals 2

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Lo8/j;->a(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    if-eqz p3, :cond_1

    .line 18
    .line 19
    invoke-interface {p3, p4}, Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;->onError(Ljava/lang/Exception;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 23
    .line 24
    return-object p0
.end method

.method private static final downloadVideoInternal$lambda$4(Lh/Hchat/hooks/items/script/ScriptWaBridge;Lfg/l;)V
    .locals 2

    .line 1
    new-instance v0, Lc9/o0;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p1, v1}, Lc9/o0;-><init>(Lfg/l;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final downloadVideoInternal$lambda$4$0(Lfg/l;)Lsf/n;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Exception;

    .line 2
    .line 3
    const-string v1, "Video download timed out"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final downloadVideoInternal$lambda$5(Lfg/l;)V
    .locals 2

    .line 1
    const-wide/32 v0, 0xea60

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/Exception;

    .line 8
    .line 9
    const-string v1, "Video download timed out"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private static final durationCodec_delegate$lambda$0()Lme/yun/silk/SilkCodec;
    .locals 1

    .line 1
    new-instance v0, Lme/yun/silk/SilkCodec;

    .line 2
    .line 3
    invoke-direct {v0}, Lme/yun/silk/SilkCodec;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendVideo$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final extensionFromUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    new-instance v1, Lsf/f;

    .line 17
    .line 18
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object p1, v1

    .line 22
    :cond_0
    :goto_0
    nop

    .line 23
    instance-of v1, p1, Lsf/f;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    move-object p1, v0

    .line 28
    :cond_1
    check-cast p1, Ljava/lang/String;

    .line 29
    .line 30
    const/16 v1, 0x2e

    .line 31
    .line 32
    invoke-static {p1, v1, v0}, Log/m;->L0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 37
    .line 38
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v1, "jpg"

    .line 47
    .line 48
    sparse-switch v0, :sswitch_data_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :sswitch_0
    const-string v0, "webp"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :sswitch_1
    const-string v0, "jpeg"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :sswitch_2
    const-string v0, "png"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :sswitch_3
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :sswitch_4
    const-string v0, "gif"

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :sswitch_5
    const-string v0, "bmp"

    .line 96
    .line 97
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_2

    .line 102
    .line 103
    :goto_1
    move-object p1, v1

    .line 104
    :cond_2
    return-object p1

    .line 105
    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_5
        0x18fc4 -> :sswitch_4
        0x19be1 -> :sswitch_3
        0x1b229 -> :sswitch_2
        0x31e068 -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendImage$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final favoriteItemMap(Lj8/i;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj8/i;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p1, Lj8/i;->a:J

    .line 7
    .line 8
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "localId"

    .line 13
    .line 14
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-wide v1, p1, Lj8/i;->a:J

    .line 18
    .line 19
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "id"

    .line 24
    .line 25
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget v1, p1, Lj8/i;->b:I

    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "type"

    .line 35
    .line 36
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const-string v1, "typeLabel"

    .line 40
    .line 41
    invoke-virtual {p1}, Lj8/i;->b()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object v1, p1, Lj8/i;->c:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    invoke-virtual {p1}, Lj8/i;->b()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v2, v1

    .line 62
    :goto_0
    const-string v3, "title"

    .line 63
    .line 64
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    const-string v2, "summary"

    .line 68
    .line 69
    invoke-virtual {p1}, Lj8/i;->a()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    const-string v2, "rawTitle"

    .line 77
    .line 78
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-string v1, "rawSummary"

    .line 82
    .line 83
    iget-object v2, p1, Lj8/i;->d:Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    iget-wide v1, p1, Lj8/i;->e:J

    .line 89
    .line 90
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    const-string v2, "totalSizeBytes"

    .line 95
    .line 96
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    iget-wide v1, p1, Lj8/i;->f:J

    .line 100
    .line 101
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v2, "updateTimeMillis"

    .line 106
    .line 107
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    const-string v1, "tags"

    .line 111
    .line 112
    iget-object p1, p1, Lj8/i;->g:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    return-object v0
.end method

.method private final fieldAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    :goto_0
    if-eqz v1, :cond_3

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    array-length v3, v2

    .line 24
    const/4 v4, 0x0

    .line 25
    :goto_1
    if-ge v4, v3, :cond_1

    .line 26
    .line 27
    aget-object v5, v2, v4

    .line 28
    .line 29
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-static {v6, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    move-object v5, v0

    .line 54
    :goto_2
    if-eqz v5, :cond_2

    .line 55
    .line 56
    const/4 p2, 0x1

    .line 57
    invoke-virtual {v5, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    goto :goto_4

    .line 65
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move-object p1, v0

    .line 71
    goto :goto_4

    .line 72
    :goto_3
    new-instance p2, Lsf/f;

    .line 73
    .line 74
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    move-object p1, p2

    .line 78
    :goto_4
    nop

    .line 79
    instance-of p2, p1, Lsf/f;

    .line 80
    .line 81
    if-eqz p2, :cond_4

    .line 82
    .line 83
    goto :goto_5

    .line 84
    :cond_4
    move-object v0, p1

    .line 85
    :goto_5
    return-object v0
.end method

.method private final fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :goto_0
    if-eqz v1, :cond_3

    .line 8
    .line 9
    const-class v2, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_3

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    array-length v3, v2

    .line 25
    const/4 v4, 0x0

    .line 26
    :goto_1
    const/4 v5, 0x0

    .line 27
    if-ge v4, v3, :cond_1

    .line 28
    .line 29
    aget-object v6, v2, v4

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-static {v7, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_0

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    move-object v6, v5

    .line 56
    :goto_2
    if-eqz v6, :cond_4

    .line 57
    .line 58
    const/4 p2, 0x1

    .line 59
    invoke-virtual {v6, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    :cond_2
    if-nez v5, :cond_5

    .line 73
    .line 74
    :cond_3
    move-object v5, v0

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    goto :goto_0

    .line 81
    :goto_3
    new-instance v5, Lsf/f;

    .line 82
    .line 83
    invoke-direct {v5, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_4
    instance-of p1, v5, Lsf/f;

    .line 87
    .line 88
    if-eqz p1, :cond_6

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_6
    move-object v0, v5

    .line 92
    :goto_5
    check-cast v0, Ljava/lang/String;

    .line 93
    .line 94
    return-object v0
.end method

.method private final varargs firstNotBlank([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const-string v2, ""

    .line 4
    .line 5
    if-lt v1, v0, :cond_0

    .line 6
    .line 7
    return-object v2

    .line 8
    :cond_0
    aget-object v3, p1, v1

    .line 9
    .line 10
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    if-nez v4, :cond_2

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    return-object v3

    .line 19
    :cond_1
    return-object v2

    .line 20
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0
.end method

.method private final varargs firstPositiveInt([Ljava/lang/Object;)I
    .locals 5

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-lt v2, v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    aget-object v3, p1, v2

    .line 8
    .line 9
    instance-of v4, v3, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    instance-of v4, v3, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    check-cast v3, Ljava/lang/String;

    .line 25
    .line 26
    const/16 v4, 0xa

    .line 27
    .line 28
    invoke-static {v4, v3}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_2

    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v3, v1

    .line 40
    :goto_1
    if-lez v3, :cond_3

    .line 41
    .line 42
    return v3

    .line 43
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 44
    .line 45
    goto :goto_0
.end method

.method private final varargs firstPositiveLong([Ljava/lang/Object;)J
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    if-lt v1, v0, :cond_0

    .line 6
    .line 7
    return-wide v2

    .line 8
    :cond_0
    aget-object v4, p1, v1

    .line 9
    .line 10
    instance-of v5, v4, Ljava/lang/Number;

    .line 11
    .line 12
    if-eqz v5, :cond_1

    .line 13
    .line 14
    check-cast v4, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    instance-of v5, v4, Ljava/lang/String;

    .line 22
    .line 23
    if-eqz v5, :cond_2

    .line 24
    .line 25
    check-cast v4, Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v4}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 34
    .line 35
    .line 36
    move-result-wide v4

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    move-wide v4, v2

    .line 39
    :goto_1
    cmp-long v2, v4, v2

    .line 40
    .line 41
    if-lez v2, :cond_3

    .line 42
    .line 43
    return-wide v4

    .line 44
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 45
    .line 46
    goto :goto_0
.end method

.method public static synthetic g(Ljava/lang/String;JLj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendFavorite$lambda$0(Ljava/lang/String;JLj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final get$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;J)Lsf/n;
    .locals 7

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v1, "GET"

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    move-object v0, p1

    .line 7
    move-object v2, p2

    .line 8
    move-object v4, p3

    .line 9
    move-wide v5, p4

    .line 10
    invoke-direct/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpText(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p0
.end method

.method private final getDurationCodec()Lme/yun/silk/SilkCodec;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->durationCodec$delegate:Lsf/c;

    .line 2
    .line 3
    invoke-interface {v0}, Lsf/c;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lme/yun/silk/SilkCodec;

    .line 8
    .line 9
    return-object v0
.end method

.method private final getOrPut(Ljava/util/Map;Ljava/lang/Object;Lfg/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TK;TV;>;TK;",
            "Lfg/a;",
            ")TV;"
        }
    .end annotation

    .line 1
    monitor-enter p1

    .line 2
    :try_start_0
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    monitor-exit p1

    .line 9
    return-object v0

    .line 10
    :cond_0
    :try_start_1
    invoke-interface {p3}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p1

    .line 18
    return-object p3

    .line 19
    :catchall_0
    move-exception p2

    .line 20
    monitor-exit p1

    .line 21
    throw p2
.end method

.method private final groupDisplayName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p3, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const-string p1, " ("

    .line 20
    .line 21
    const-string v0, ")"

    .line 22
    .line 23
    invoke-static {p3, p1, p2, v0}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_0
    return-object p3

    .line 29
    :cond_1
    filled-new-array {p2, p3, p1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method private final guessFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    new-instance v0, Lsf/f;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p1, v0

    .line 17
    :goto_0
    nop

    .line 18
    instance-of v0, p1, Lsf/f;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    move-object p1, v1

    .line 24
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    :cond_1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    xor-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    :cond_2
    if-eqz v1, :cond_3

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    const-string p1, "download_"

    .line 55
    .line 56
    invoke-static {v0, v1, p1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :goto_1
    return-object v1
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareMusicVideo$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final httpClient(J)Lokhttp3/OkHttpClient;
    .locals 3

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-gez v2, :cond_0

    .line 6
    .line 7
    move-wide p1, v0

    .line 8
    :cond_0
    const-wide/16 v0, 0x12c

    .line 9
    .line 10
    cmp-long v2, p1, v0

    .line 11
    .line 12
    if-lez v2, :cond_1

    .line 13
    .line 14
    move-wide p1, v0

    .line 15
    :cond_1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpClients:Ljava/util/Map;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    check-cast v0, Ljava/util/Map;

    .line 21
    .line 22
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Leb/x0;

    .line 27
    .line 28
    invoke-direct {v2, p1, p2}, Leb/x0;-><init>(J)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0, v1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getOrPut(Ljava/util/Map;Ljava/lang/Object;Lfg/a;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p1, Lokhttp3/OkHttpClient;

    .line 39
    .line 40
    return-object p1
.end method

.method private static final httpClient$lambda$0(J)Lokhttp3/OkHttpClient;
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p1, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p0, p1, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0, p0, p1, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->followRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0, p1}, Lokhttp3/OkHttpClient$Builder;->followSslRedirects(Z)Lokhttp3/OkHttpClient$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method private final httpText(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/Map<",
            "**>;J)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_5

    .line 3
    .line 4
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    :try_start_0
    invoke-direct {p0, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->normalizeMap(Ljava/util/Map;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p4

    .line 16
    new-instance v1, Lokhttp3/Request$Builder;

    .line 17
    .line 18
    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-direct {p0, p2, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->applyHeaders(Lokhttp3/Request$Builder;Ljava/util/Map;)Lokhttp3/Request$Builder;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const-string v1, "POST"

    .line 30
    .line 31
    invoke-static {p1, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-direct {p0, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->defaultContentType(Ljava/util/Map;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    .line 42
    .line 43
    invoke-direct {p0, p3, p4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->buildPostBody(Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    sget-object p4, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    .line 48
    .line 49
    invoke-virtual {p4, v1}, Lokhttp3/MediaType$Companion;->get(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    invoke-virtual {v2, p3, p4}, Lokhttp3/RequestBody$Companion;->create(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    invoke-virtual {p2, p3}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p2

    .line 62
    goto :goto_3

    .line 63
    :cond_1
    invoke-virtual {p2}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-direct {p0, p5, p6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpClient(J)Lokhttp3/OkHttpClient;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p2}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p3, p2}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-interface {p2}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    .line 79
    .line 80
    .line 81
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    :try_start_1
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    if-eqz p3, :cond_2

    .line 87
    .line 88
    invoke-virtual {p3}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 92
    goto :goto_1

    .line 93
    :catchall_1
    move-exception p3

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move-object p3, v0

    .line 96
    :goto_1
    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :goto_2
    :try_start_3
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 101
    :catchall_2
    move-exception p4

    .line 102
    :try_start_4
    invoke-static {p2, p3}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw p4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 106
    :goto_3
    new-instance p3, Lsf/f;

    .line 107
    .line 108
    invoke-direct {p3, p2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    :goto_4
    invoke-static {p3}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    if-eqz p2, :cond_3

    .line 116
    .line 117
    iget-object p4, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    new-instance p5, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string p6, "HTTP "

    .line 126
    .line 127
    invoke-direct {p5, p6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    const-string p1, " \u5931\u8d25: "

    .line 134
    .line 135
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p4, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :cond_3
    instance-of p1, p3, Lsf/f;

    .line 149
    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_4
    move-object v0, p3

    .line 154
    :goto_5
    check-cast v0, Ljava/lang/String;

    .line 155
    .line 156
    :cond_5
    :goto_6
    return-object v0
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendFile$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final imageDownloadRequest(Ljava/lang/Object;)Leb/a1;
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "getBigImgUrl"

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "bigImgUrl"

    .line 11
    .line 12
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "getMidImgUrl"

    .line 25
    .line 26
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "midImgUrl"

    .line 31
    .line 32
    invoke-direct {p0, p1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "getThumbUrl"

    .line 45
    .line 46
    invoke-direct {p0, p1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const-string v3, "thumbUrl"

    .line 51
    .line 52
    invoke-direct {p0, p1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    :goto_0
    const/4 p1, 0x0

    .line 79
    return-object p1

    .line 80
    :cond_1
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-nez v2, :cond_2

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    :goto_1
    move v4, v2

    .line 88
    goto :goto_2

    .line 89
    :cond_2
    const/4 v2, 0x2

    .line 90
    goto :goto_1

    .line 91
    :goto_2
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_3

    .line 96
    .line 97
    const-string v0, "getBigLength"

    .line 98
    .line 99
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "bigLength"

    .line 104
    .line 105
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstPositiveInt([Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    :goto_3
    move v5, v0

    .line 118
    goto :goto_4

    .line 119
    :cond_3
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    const-string v0, "getMidLength"

    .line 126
    .line 127
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const-string v1, "midLength"

    .line 132
    .line 133
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstPositiveInt([Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    goto :goto_3

    .line 146
    :cond_4
    const-string v0, "getThumbLength"

    .line 147
    .line 148
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v1, "thumbLength"

    .line 153
    .line 154
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstPositiveInt([Ljava/lang/Object;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    goto :goto_3

    .line 167
    :goto_4
    const-string v0, "getMd5"

    .line 168
    .line 169
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const-string v1, "md5"

    .line 174
    .line 175
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    const-string v0, "getKey"

    .line 188
    .line 189
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "getAesKey"

    .line 194
    .line 195
    invoke-direct {p0, p1, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    const-string v2, "key"

    .line 200
    .line 201
    invoke-direct {p0, p1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const-string v3, "aesKey"

    .line 206
    .line 207
    invoke-direct {p0, p1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    filled-new-array {v0, v1, v2, p1}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    new-instance v3, Leb/a1;

    .line 220
    .line 221
    invoke-direct/range {v3 .. v8}, Leb/a1;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-object v3
.end method

.method private final isHttpUrl(Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0, p1, v0}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "http://"

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    const-string v0, "https://"

    .line 17
    .line 18
    invoke-static {p1, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 27
    return p1
.end method

.method public static synthetic j(Lh/Hchat/hooks/items/script/ScriptWaBridge;Leb/w0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal$lambda$4(Lh/Hchat/hooks/items/script/ScriptWaBridge;Lfg/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendText$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareText$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final logDownload(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->currentPluginDir:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->currentPluginName:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1, v2, v0, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/String;Ljava/io/File;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v1, p1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic m(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideo$lambda$1(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final mentionDisplayName(Lg8/i;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "notify@all"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "\u6240\u6709\u4eba"

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-virtual {p1, p3}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, p2, p3}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 p2, 0x0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, v0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v1, p2

    .line 27
    :goto_0
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object p2, v0, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 30
    .line 31
    :cond_2
    filled-new-array {p1, v1, p2, p3}, [Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1
.end method

.method public static synthetic n(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMediaMsg$lambda$0(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final normalizeDownloadUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p1, v0

    .line 14
    :goto_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    move-object p1, v1

    .line 19
    :cond_1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_2
    iget-object v2, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->atPattern:Ljava/util/regex/Pattern;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_5

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    invoke-virtual {v2, p1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_3
    if-nez v0, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move-object v1, v0

    .line 57
    :goto_1
    move-object p1, v1

    .line 58
    :cond_5
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->unescapeXmlText(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method private final normalizeMap(Ljava/util/Map;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_6

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Ljava/util/Map$Entry;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object v2, v3

    .line 62
    :goto_1
    const-string v4, ""

    .line 63
    .line 64
    if-nez v2, :cond_2

    .line 65
    .line 66
    move-object v2, v4

    .line 67
    :cond_2
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_3

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    if-eqz v1, :cond_4

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_4
    if-nez v3, :cond_5

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_5
    move-object v4, v3

    .line 84
    :goto_2
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    return-object v0

    .line 89
    :cond_7
    :goto_3
    sget-object p1, Ltf/u;->g:Ltf/u;

    .line 90
    .line 91
    return-object p1
.end method

.method public static synthetic o(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Lsf/n;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->post$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic p(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async$lambda$1(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final parseAtContent(Ljava/lang/String;Ljava/lang/String;)Leb/b1;
    .locals 7

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-static {p1}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_2

    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->atPattern:Ljava/util/regex/Pattern;

    .line 17
    .line 18
    invoke-virtual {v2, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    new-instance v2, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v3, Ljava/lang/StringBuffer;

    .line 28
    .line 29
    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-virtual {p2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move-object v4, v1

    .line 55
    :goto_1
    const-string v5, ""

    .line 56
    .line 57
    if-nez v4, :cond_2

    .line 58
    .line 59
    move-object v4, v5

    .line 60
    :cond_2
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    invoke-virtual {p2, v3, v5}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v0, p1, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->mentionDisplayName(Lg8/i;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    new-instance v5, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v6, "@"

    .line 80
    .line 81
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v4, "\u2005"

    .line 88
    .line 89
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-static {v4}, Ljava/util/regex/Matcher;->quoteReplacement(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v3, v4}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    invoke-virtual {p2, v3}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_5

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_5
    new-instance p1, Leb/b1;

    .line 118
    .line 119
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {v2}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-direct {p1, p2, v0}, Leb/b1;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 135
    .line 136
    .line 137
    return-object p1

    .line 138
    :cond_6
    :goto_2
    return-object v1
.end method

.method private static final post$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Lsf/n;
    .locals 7

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string v1, "POST"

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-wide v5, p5

    .line 10
    invoke-direct/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpText(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic q(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImage$lambda$0(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic r(ILjava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendVoice$lambda$1(ILjava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final rawFriendList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatContact;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!=\'\' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE \'%chatroom\'"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 16
    .line 17
    return-object v0
.end method

.method private final rawGroupContactMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lh/Hchat/hooks/api/model/WeChatContact;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/i;->x()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    :goto_0
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ltf/y;->a0(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/16 v2, 0x10

    .line 23
    .line 24
    if-ge v1, v2, :cond_1

    .line 25
    .line 26
    move v1, v2

    .line 27
    :cond_1
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    move-object v3, v1

    .line 47
    check-cast v3, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 48
    .line 49
    iget-object v3, v3, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    return-object v2
.end method

.method private final rawGroupList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatChatroom;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/d;->g()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    return-object v0
.end method

.method private final readGroupMemberIds(Ljava/lang/String;Z)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 p2, 0x5

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p2, 0x1

    .line 6
    :goto_0
    const/4 v0, 0x0

    .line 7
    :goto_1
    if-ge v0, p2, :cond_8

    .line 8
    .line 9
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Lg8/d;->i(Ljava/lang/String;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :cond_1
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v5, v4

    .line 45
    check-cast v5, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_1

    .line 55
    .line 56
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    if-eqz v1, :cond_4

    .line 61
    .line 62
    invoke-virtual {v1, p1}, Lg8/i;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :cond_3
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    move-object v5, v4

    .line 81
    check-cast v5, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-nez v5, :cond_3

    .line 91
    .line 92
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    if-eqz v1, :cond_6

    .line 97
    .line 98
    invoke-virtual {v1, p1}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-eqz v1, :cond_6

    .line 107
    .line 108
    check-cast v1, Ljava/lang/Iterable;

    .line 109
    .line 110
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-eqz v2, :cond_6

    .line 119
    .line 120
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    move-object v4, v2

    .line 125
    check-cast v4, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-nez v4, :cond_5

    .line 135
    .line 136
    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_7

    .line 145
    .line 146
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :cond_7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->waitForContactData(I)V

    .line 152
    .line 153
    .line 154
    add-int/lit8 v0, v0, 0x1

    .line 155
    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :cond_8
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 159
    .line 160
    return-object p1
.end method

.method private final resolveDownloadTarget(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "/"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-static {p2, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    new-instance p2, Ljava/io/File;

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->guessFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    new-instance p2, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->guessFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    invoke-static {v0}, Ldg/l;->c0(Ljava/io/File;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_2

    .line 56
    .line 57
    new-instance p2, Ljava/io/File;

    .line 58
    .line 59
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->guessFileName(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object p2

    .line 67
    :cond_2
    return-object v0
.end method

.method public static synthetic s(Lfg/l;)Lsf/n;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadVideoInternal$lambda$4$0(Lfg/l;)Lsf/n;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final sendEmoji$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    iget-object p2, p2, Lj8/p;->d:Lj8/f;

    .line 13
    .line 14
    invoke-virtual {p2, p0, p1}, Lj8/f;->v(Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private static final sendFavorite$lambda$0(Ljava/lang/String;JLj8/p;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p3, p3, Lj8/p;->f:Lj8/h;

    .line 5
    .line 6
    invoke-virtual {p3, p1, p2, p0}, Lj8/h;->z(JLjava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final sendFavorite$lambda$1(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, Lj8/p;->f:Lj8/h;

    .line 5
    .line 6
    invoke-virtual {p2, p0, p1}, Lj8/h;->A(Ljava/lang/String;Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final sendFile$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    iget-object p2, p2, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 13
    .line 14
    invoke-virtual {p2, p0, p1, v0}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private static final sendFile$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    if-nez p2, :cond_2

    .line 13
    .line 14
    move-object p2, v0

    .line 15
    :cond_2
    iget-object p3, p3, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 16
    .line 17
    invoke-virtual {p3, p0, p1, p2}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method private static final sendImage$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    invoke-virtual {p2, p0, p1}, Lj8/p;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method private static final sendImage$lambda$1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    if-nez p2, :cond_2

    .line 13
    .line 14
    move-object p2, v0

    .line 15
    :cond_2
    iget-object p3, p3, Lj8/p;->a:Lj8/n;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p3, p0, p1, p2, v0}, Lj8/n;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method private final sendMedia(Lfg/l;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg/l;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->i()Lj8/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :try_start_0
    invoke-interface {p1, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    new-instance v0, Lsf/f;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v0

    .line 31
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    instance-of v1, p1, Lsf/f;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    move-object p1, v0

    .line 38
    :cond_0
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    return p1
.end method

.method private static final sendMediaMsg$lambda$0(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    const-string p2, ""

    .line 7
    .line 8
    :cond_0
    iget-object p3, p3, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 9
    .line 10
    invoke-virtual {p3, p1, p0, p2}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static final sendOriginalImage$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    iget-object p2, p2, Lj8/p;->a:Lj8/n;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {p2, p0, p1, v0, v1}, Lj8/n;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method private static final sendText$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)Lsf/n;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendText(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    new-instance p2, Lsf/f;

    .line 12
    .line 13
    invoke-direct {p2, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    move-object p0, p2

    .line 17
    :goto_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    instance-of p3, p0, Lsf/f;

    .line 20
    .line 21
    if-eqz p3, :cond_0

    .line 22
    .line 23
    move-object p0, p2

    .line 24
    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    const-wide/16 p2, 0x0

    .line 35
    .line 36
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/4 p0, 0x0

    .line 42
    :goto_1
    invoke-interface {p1, p0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object p0, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p0
.end method

.method private static final sendVideo$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, Lj8/p;->c:Lbb/b;

    .line 5
    .line 6
    const-string v0, ""

    .line 7
    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    move-object p0, v0

    .line 11
    :cond_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    :cond_1
    invoke-virtual {p2, p0, p1}, Lbb/b;->q(Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private static final sendVoice$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    move-object p0, v0

    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    :cond_1
    iget-object p2, p2, Lj8/p;->b:Lj8/y;

    .line 13
    .line 14
    invoke-virtual {p2, p0, p1}, Lj8/y;->t(Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method private static final sendVoice$lambda$1(ILjava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const v1, 0x20c49b

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, v1}, Lr9/e0;->r(III)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    mul-int/lit16 p0, p0, 0x3e8

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    move-object p1, v0

    .line 19
    :cond_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    move-object p2, v0

    .line 22
    :cond_1
    iget-object p3, p3, Lj8/p;->b:Lj8/y;

    .line 23
    .line 24
    invoke-virtual {p3, p0, p1, p2}, Lj8/y;->s(ILjava/lang/String;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method private static final shareFile$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    :cond_0
    iget-object p3, p4, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 9
    .line 10
    invoke-virtual {p3, p0, p2, p1}, Landroidx/lifecycle/x;->T(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static final shareMiniProgram$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    if-nez p4, :cond_2

    .line 13
    .line 14
    move-object p4, v0

    .line 15
    :cond_2
    if-nez p6, :cond_3

    .line 16
    .line 17
    move-object p6, p5

    .line 18
    move-object p5, p4

    .line 19
    move-object p4, p3

    .line 20
    move-object p3, p2

    .line 21
    move-object p2, p1

    .line 22
    move-object p1, p0

    .line 23
    move-object p0, p7

    .line 24
    move-object p7, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_3
    move-object v1, p1

    .line 27
    move-object p1, p0

    .line 28
    move-object p0, p7

    .line 29
    move-object p7, p6

    .line 30
    move-object p6, p5

    .line 31
    move-object p5, p4

    .line 32
    move-object p4, p3

    .line 33
    move-object p3, p2

    .line 34
    move-object p2, v1

    .line 35
    :goto_0
    invoke-virtual/range {p0 .. p7}, Lj8/p;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0
.end method

.method private static final shareMusic$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 11

    .line 1
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object v3, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v3, p1

    .line 11
    :goto_0
    if-nez p2, :cond_1

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move-object v4, p2

    .line 16
    :goto_1
    if-nez p6, :cond_2

    .line 17
    .line 18
    move-object v10, v0

    .line 19
    :goto_2
    move-object/from16 p1, p7

    .line 20
    .line 21
    goto :goto_3

    .line 22
    :cond_2
    move-object/from16 v10, p6

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :goto_3
    iget-object v1, p1, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 26
    .line 27
    const-string v7, ""

    .line 28
    .line 29
    const-string v8, ""

    .line 30
    .line 31
    move-object v2, p0

    .line 32
    move-object v5, p3

    .line 33
    move-object v6, p4

    .line 34
    move-object/from16 v9, p5

    .line 35
    .line 36
    invoke-virtual/range {v1 .. v10}, Landroidx/lifecycle/x;->Z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method private static final shareMusicVideo$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 13

    .line 1
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    move-object v1, p2

    .line 14
    :goto_0
    if-nez p5, :cond_2

    .line 15
    .line 16
    move-object v7, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_2
    move-object/from16 v7, p5

    .line 19
    .line 20
    :goto_1
    if-nez p7, :cond_3

    .line 21
    .line 22
    move-object v11, v0

    .line 23
    goto :goto_2

    .line 24
    :cond_3
    move-object/from16 v11, p7

    .line 25
    .line 26
    :goto_2
    if-nez p9, :cond_4

    .line 27
    .line 28
    :goto_3
    move-object/from16 v2, p10

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_4
    move-object/from16 v0, p9

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :goto_4
    iget-object v12, v2, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 35
    .line 36
    invoke-static/range {p6 .. p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v9

    .line 40
    const-string v10, "songLyric"

    .line 41
    .line 42
    const-string v2, "musicUrl"

    .line 43
    .line 44
    const-string v4, "musicDataUrl"

    .line 45
    .line 46
    const-string v6, "singerName"

    .line 47
    .line 48
    const-string v8, "duration"

    .line 49
    .line 50
    move-object/from16 v3, p3

    .line 51
    .line 52
    move-object/from16 v5, p4

    .line 53
    .line 54
    filled-new-array/range {v2 .. v11}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-string v3, "description"

    .line 66
    .line 67
    const-string v4, "thumbData"

    .line 68
    .line 69
    const-string v5, "title"

    .line 70
    .line 71
    move-object p2, p1

    .line 72
    move-object/from16 p6, p8

    .line 73
    .line 74
    move-object/from16 p4, v1

    .line 75
    .line 76
    move-object/from16 p3, v3

    .line 77
    .line 78
    move-object/from16 p5, v4

    .line 79
    .line 80
    move-object p1, v5

    .line 81
    filled-new-array/range {p1 .. p6}, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v1, "com.tencent.mm.opensdk.modelmsg.WXMusicVideoObject"

    .line 90
    .line 91
    invoke-virtual {v12, v1, v2, p1}, Landroidx/lifecycle/x;->D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    if-eqz p1, :cond_5

    .line 96
    .line 97
    invoke-virtual {v12, p1, p0, v0}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_5

    .line 102
    .line 103
    const/4 p0, 0x1

    .line 104
    return p0

    .line 105
    :cond_5
    const/4 p0, 0x0

    .line 106
    return p0
.end method

.method private static final shareText$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    .line 6
    const-string p2, ""

    .line 7
    .line 8
    :cond_0
    iget-object p3, p3, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 9
    .line 10
    const-string v0, "text"

    .line 11
    .line 12
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "description"

    .line 24
    .line 25
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "com.tencent.mm.opensdk.modelmsg.WXTextObject"

    .line 34
    .line 35
    invoke-virtual {p3, v1, v0, p1}, Landroidx/lifecycle/x;->D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p3, p1, p0, p2}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    return p0

    .line 49
    :cond_1
    const/4 p0, 0x0

    .line 50
    return p0
.end method

.method private static final shareVideo$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 3

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    if-nez p5, :cond_2

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_2
    move-object v0, p5

    .line 16
    :goto_0
    iget-object v1, p6, Lj8/p;->e:Landroidx/lifecycle/x;

    .line 17
    .line 18
    const-string p5, "videoUrl"

    .line 19
    .line 20
    filled-new-array {p5, p3}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {p3}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string p3, "description"

    .line 32
    .line 33
    const-string p5, "thumbData"

    .line 34
    .line 35
    move-object p6, p4

    .line 36
    move-object p4, p2

    .line 37
    move-object p2, p1

    .line 38
    const-string p1, "title"

    .line 39
    .line 40
    filled-new-array/range {p1 .. p6}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, Landroidx/lifecycle/x;->q([Ljava/lang/Object;)[[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "com.tencent.mm.opensdk.modelmsg.WXVideoObject"

    .line 49
    .line 50
    invoke-virtual {v1, p2, v2, p1}, Landroidx/lifecycle/x;->D(Ljava/lang/String;[[Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {v1, p1, p0, v0}, Landroidx/lifecycle/x;->U(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    return p0

    .line 64
    :cond_3
    const/4 p0, 0x0

    .line 65
    return p0
.end method

.method private static final shareWebpage$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 2

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object p1, v0

    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    if-nez p5, :cond_2

    .line 13
    .line 14
    move-object p5, p4

    .line 15
    move-object p4, p3

    .line 16
    move-object p3, p2

    .line 17
    move-object p2, p1

    .line 18
    move-object p1, p0

    .line 19
    move-object p0, p6

    .line 20
    move-object p6, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move-object v1, p1

    .line 23
    move-object p1, p0

    .line 24
    move-object p0, p6

    .line 25
    move-object p6, p5

    .line 26
    move-object p5, p4

    .line 27
    move-object p4, p3

    .line 28
    move-object p3, p2

    .line 29
    move-object p2, v1

    .line 30
    :goto_0
    invoke-virtual/range {p0 .. p6}, Lj8/p;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static synthetic t(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendVoice$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final targetFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    move-object v0, p1

    .line 13
    :cond_1
    const-string p1, "."

    .line 14
    .line 15
    const-string v1, "image_"

    .line 16
    .line 17
    if-eqz v0, :cond_5

    .line 18
    .line 19
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    new-instance v2, Ljava/io/File;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v3, "/"

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static {v0, v3, v4}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_4

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    return-object v2

    .line 48
    :cond_4
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    invoke-static {v3, v4, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    filled-new-array {p2, v0}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->extensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-static {p2, p1, p3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, Ljava/io/File;

    .line 73
    .line 74
    invoke-direct {p2, v2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object p2

    .line 78
    :cond_5
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    invoke-static {v2, v3, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    filled-new-array {p2, v0}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-direct {p0, p3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->extensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p3

    .line 98
    invoke-static {p2, p1, p3}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance p2, Ljava/io/File;

    .line 103
    .line 104
    iget-object p3, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 105
    .line 106
    invoke-virtual {p3}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 107
    .line 108
    .line 109
    move-result-object p3

    .line 110
    const-string v0, "Image"

    .line 111
    .line 112
    invoke-static {p3, v0}, Lzb/b;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    invoke-direct {p2, p3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object p2
.end method

.method public static synthetic u(J)Lokhttp3/OkHttpClient;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->httpClient$lambda$0(J)Lokhttp3/OkHttpClient;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final unescapeXmlText(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    const-string v0, "&quot;"

    .line 9
    .line 10
    const-string v1, "\""

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-string v0, "&#x20;"

    .line 18
    .line 19
    const-string v1, " "

    .line 20
    .line 21
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "&#x0A;"

    .line 26
    .line 27
    const-string v1, "\n"

    .line 28
    .line 29
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v0, "&lt;"

    .line 34
    .line 35
    const-string v1, "<"

    .line 36
    .line 37
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "&gt;"

    .line 42
    .line 43
    const-string v1, ">"

    .line 44
    .line 45
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "&apos;"

    .line 50
    .line 51
    const-string v1, "\'"

    .line 52
    .line 53
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, "&amp;"

    .line 58
    .line 59
    const-string v1, "&"

    .line 60
    .line 61
    invoke-static {p1, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v0, Log/k;

    .line 66
    .line 67
    const-string v1, "&#(x[0-9a-fA-F]+|[0-9]+);"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lb0/d0;

    .line 73
    .line 74
    const/16 v2, 0xb

    .line 75
    .line 76
    invoke-direct {v1, p0, v2}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p1, v1}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method

.method private static final unescapeXmlText$lambda$0(Lh/Hchat/hooks/items/script/ScriptWaBridge;Log/f;)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Log/i;

    .line 5
    .line 6
    invoke-virtual {p1}, Log/i;->a()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Log/g;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, Log/g;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;

    .line 18
    .line 19
    :try_start_0
    const-string v1, "x"

    .line 20
    .line 21
    invoke-static {p0, v1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const/16 v0, 0x10

    .line 32
    .line 33
    invoke-static {v0}, La/a;->w(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_2

    .line 52
    :goto_1
    new-instance v0, Lsf/f;

    .line 53
    .line 54
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    move-object p0, v0

    .line 58
    :goto_2
    nop

    .line 59
    instance-of v0, p0, Lsf/f;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    :cond_1
    check-cast p0, Ljava/lang/Integer;

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    :try_start_1
    invoke-static {p0}, Ljava/lang/Character;->toChars(I)[C

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v0, Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :catchall_1
    move-exception p0

    .line 86
    new-instance v0, Lsf/f;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    invoke-virtual {p1}, Log/i;->c()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    instance-of p1, v0, Lsf/f;

    .line 96
    .line 97
    if-eqz p1, :cond_2

    .line 98
    .line 99
    move-object v0, p0

    .line 100
    :cond_2
    check-cast v0, Ljava/lang/CharSequence;

    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_3
    invoke-virtual {p1}, Log/i;->c()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method

.method public static synthetic v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareMusic$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final videoDownloadRequest(Ljava/lang/Object;)Leb/c1;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    instance-of v1, p1, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 11
    .line 12
    invoke-virtual {v2}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getMessage()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    instance-of v3, v2, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    instance-of v2, p1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    move-object v2, p1

    .line 28
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object v2, v0

    .line 32
    :goto_0
    if-eqz v1, :cond_3

    .line 33
    .line 34
    move-object v1, p1

    .line 35
    check-cast v1, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 36
    .line 37
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptMessageBean;->getVideoMsg()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :cond_3
    instance-of v1, p1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 43
    .line 44
    if-eqz v1, :cond_4

    .line 45
    .line 46
    move-object v1, p1

    .line 47
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 48
    .line 49
    invoke-virtual {v1}, Lh/Hchat/hooks/api/model/WeChatMessage;->getVideoMsg()Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_1

    .line 54
    :cond_4
    move-object v1, p1

    .line 55
    :goto_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    if-eqz v3, :cond_5

    .line 60
    .line 61
    iget-object v3, v3, Lj8/p;->c:Lbb/b;

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_5
    move-object v3, v0

    .line 65
    :goto_2
    if-eqz v2, :cond_6

    .line 66
    .line 67
    iget-object v2, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_6
    move-object v2, v0

    .line 71
    :goto_3
    const-string v4, "getImagePath"

    .line 72
    .line 73
    invoke-direct {p0, p1, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const-string v5, "imagePath"

    .line 78
    .line 79
    invoke-direct {p0, p1, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    filled-new-array {v2, v4, p1}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_7

    .line 96
    .line 97
    if-eqz v3, :cond_7

    .line 98
    .line 99
    invoke-virtual {v3, p1}, Lbb/b;->n(Ljava/lang/String;)Lj8/r;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    goto :goto_4

    .line 104
    :cond_7
    move-object v2, v0

    .line 105
    :goto_4
    if-eqz v2, :cond_8

    .line 106
    .line 107
    iget-wide v4, v2, Lj8/r;->d:J

    .line 108
    .line 109
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    goto :goto_5

    .line 114
    :cond_8
    move-object v4, v0

    .line 115
    :goto_5
    if-eqz v1, :cond_9

    .line 116
    .line 117
    const-string v5, "getLength"

    .line 118
    .line 119
    invoke-direct {p0, v1, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    goto :goto_6

    .line 124
    :cond_9
    move-object v5, v0

    .line 125
    :goto_6
    if-eqz v1, :cond_a

    .line 126
    .line 127
    const-string v6, "length"

    .line 128
    .line 129
    invoke-direct {p0, v1, v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldAny(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    goto :goto_7

    .line 134
    :cond_a
    move-object v6, v0

    .line 135
    :goto_7
    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-direct {p0, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstPositiveLong([Ljava/lang/Object;)J

    .line 140
    .line 141
    .line 142
    move-result-wide v9

    .line 143
    new-instance v4, Ljava/io/File;

    .line 144
    .line 145
    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-eqz v4, :cond_b

    .line 161
    .line 162
    move-object v4, p1

    .line 163
    goto :goto_8

    .line 164
    :cond_b
    move-object v4, v0

    .line 165
    :goto_8
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    const/4 v6, 0x1

    .line 170
    xor-int/2addr v5, v6

    .line 171
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-eqz v5, :cond_c

    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_c
    move-object p1, v0

    .line 183
    :goto_9
    if-eqz p1, :cond_d

    .line 184
    .line 185
    if-eqz v3, :cond_d

    .line 186
    .line 187
    invoke-virtual {v3, p1}, Lbb/b;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    goto :goto_a

    .line 192
    :cond_d
    move-object p1, v0

    .line 193
    :goto_a
    filled-new-array {v4, p1}, [Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    xor-int/2addr v3, v6

    .line 206
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_e

    .line 215
    .line 216
    goto :goto_b

    .line 217
    :cond_e
    move-object p1, v0

    .line 218
    :goto_b
    if-eqz p1, :cond_12

    .line 219
    .line 220
    new-instance v3, Ljava/io/File;

    .line 221
    .line 222
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_f

    .line 230
    .line 231
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 232
    .line 233
    .line 234
    move-result-wide v4

    .line 235
    const-wide/16 v7, 0x0

    .line 236
    .line 237
    cmp-long p1, v4, v7

    .line 238
    .line 239
    if-lez p1, :cond_f

    .line 240
    .line 241
    cmp-long p1, v9, v7

    .line 242
    .line 243
    if-lez p1, :cond_10

    .line 244
    .line 245
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 246
    .line 247
    .line 248
    move-result-wide v4

    .line 249
    cmp-long p1, v4, v9

    .line 250
    .line 251
    if-ltz p1, :cond_f

    .line 252
    .line 253
    goto :goto_c

    .line 254
    :cond_f
    const/4 v6, 0x0

    .line 255
    :cond_10
    :goto_c
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-eqz p1, :cond_11

    .line 264
    .line 265
    goto :goto_d

    .line 266
    :cond_11
    move-object v3, v0

    .line 267
    :goto_d
    move-object v11, v3

    .line 268
    goto :goto_e

    .line 269
    :cond_12
    move-object v11, v0

    .line 270
    :goto_e
    if-eqz v2, :cond_13

    .line 271
    .line 272
    iget-object p1, v2, Lj8/r;->a:Ljava/lang/String;

    .line 273
    .line 274
    goto :goto_f

    .line 275
    :cond_13
    move-object p1, v0

    .line 276
    :goto_f
    if-eqz v1, :cond_14

    .line 277
    .line 278
    const-string v3, "getNewMd5"

    .line 279
    .line 280
    invoke-direct {p0, v1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    goto :goto_10

    .line 285
    :cond_14
    move-object v3, v0

    .line 286
    :goto_10
    if-eqz v1, :cond_15

    .line 287
    .line 288
    const-string v4, "getMd5"

    .line 289
    .line 290
    invoke-direct {p0, v1, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    goto :goto_11

    .line 295
    :cond_15
    move-object v4, v0

    .line 296
    :goto_11
    if-eqz v1, :cond_16

    .line 297
    .line 298
    const-string v5, "newMd5"

    .line 299
    .line 300
    invoke-direct {p0, v1, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    goto :goto_12

    .line 305
    :cond_16
    move-object v5, v0

    .line 306
    :goto_12
    if-eqz v1, :cond_17

    .line 307
    .line 308
    const-string v6, "md5"

    .line 309
    .line 310
    invoke-direct {p0, v1, v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    goto :goto_13

    .line 315
    :cond_17
    move-object v6, v0

    .line 316
    :goto_13
    filled-new-array {p1, v3, v4, v5, v6}, [Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    if-eqz v2, :cond_18

    .line 325
    .line 326
    iget-object p1, v2, Lj8/r;->b:Ljava/lang/String;

    .line 327
    .line 328
    goto :goto_14

    .line 329
    :cond_18
    move-object p1, v0

    .line 330
    :goto_14
    if-eqz v1, :cond_19

    .line 331
    .line 332
    const-string v3, "getCdnVideoUrl"

    .line 333
    .line 334
    invoke-direct {p0, v1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    goto :goto_15

    .line 339
    :cond_19
    move-object v3, v0

    .line 340
    :goto_15
    if-eqz v1, :cond_1a

    .line 341
    .line 342
    const-string v4, "getCdnUrl"

    .line 343
    .line 344
    invoke-direct {p0, v1, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    goto :goto_16

    .line 349
    :cond_1a
    move-object v4, v0

    .line 350
    :goto_16
    if-eqz v1, :cond_1b

    .line 351
    .line 352
    const-string v5, "cdnVideoUrl"

    .line 353
    .line 354
    invoke-direct {p0, v1, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v5

    .line 358
    goto :goto_17

    .line 359
    :cond_1b
    move-object v5, v0

    .line 360
    :goto_17
    if-eqz v1, :cond_1c

    .line 361
    .line 362
    const-string v7, "cdnUrl"

    .line 363
    .line 364
    invoke-direct {p0, v1, v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    goto :goto_18

    .line 369
    :cond_1c
    move-object v7, v0

    .line 370
    :goto_18
    filled-new-array {p1, v3, v4, v5, v7}, [Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v7

    .line 378
    if-eqz v2, :cond_1d

    .line 379
    .line 380
    iget-object p1, v2, Lj8/r;->c:Ljava/lang/String;

    .line 381
    .line 382
    goto :goto_19

    .line 383
    :cond_1d
    move-object p1, v0

    .line 384
    :goto_19
    if-eqz v1, :cond_1e

    .line 385
    .line 386
    const-string v2, "getAesKey"

    .line 387
    .line 388
    invoke-direct {p0, v1, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    goto :goto_1a

    .line 393
    :cond_1e
    move-object v2, v0

    .line 394
    :goto_1a
    if-eqz v1, :cond_1f

    .line 395
    .line 396
    const-string v3, "aesKey"

    .line 397
    .line 398
    invoke-direct {p0, v1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->fieldString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    goto :goto_1b

    .line 403
    :cond_1f
    move-object v1, v0

    .line 404
    :goto_1b
    filled-new-array {p1, v2, v1}, [Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    if-nez v11, :cond_20

    .line 413
    .line 414
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 415
    .line 416
    .line 417
    move-result p1

    .line 418
    if-eqz p1, :cond_20

    .line 419
    .line 420
    return-object v0

    .line 421
    :cond_20
    new-instance v5, Leb/c1;

    .line 422
    .line 423
    invoke-direct/range {v5 .. v11}, Leb/c1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/io/File;)V

    .line 424
    .line 425
    .line 426
    return-object v5
.end method

.method private final videoTargetFile(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-string v2, "video_"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    filled-new-array {p2, v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    const-string v0, ".mp4"

    .line 20
    .line 21
    invoke-static {p2, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x0

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p1, v0

    .line 36
    :goto_0
    move-object v0, p1

    .line 37
    :cond_1
    if-eqz v0, :cond_5

    .line 38
    .line 39
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    new-instance p1, Ljava/io/File;

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v1, "/"

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-static {v0, v1, v2}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    return-object p1

    .line 68
    :cond_4
    :goto_1
    new-instance v0, Ljava/io/File;

    .line 69
    .line 70
    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_5
    :goto_2
    new-instance p1, Ljava/io/File;

    .line 75
    .line 76
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 77
    .line 78
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "Video"

    .line 83
    .line 84
    invoke-static {v0, v1}, Lzb/b;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p1
.end method

.method public static synthetic w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareWebpage$lambda$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final waitDownloadedFile(Ljava/io/File;J)Z
    .locals 12

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    cmp-long v4, p2, v2

    .line 8
    .line 9
    if-gez v4, :cond_0

    .line 10
    .line 11
    move-wide p2, v2

    .line 12
    :cond_0
    add-long/2addr v0, p2

    .line 13
    const-wide/16 p2, -0x1

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    move-wide v3, p2

    .line 17
    move v5, v2

    .line 18
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    cmp-long v6, v6, v0

    .line 23
    .line 24
    const-wide/16 v7, 0x0

    .line 25
    .line 26
    const/4 v9, 0x1

    .line 27
    if-gez v6, :cond_4

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 36
    .line 37
    .line 38
    move-result-wide v10

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-wide v10, p2

    .line 41
    :goto_1
    cmp-long v6, v10, v7

    .line 42
    .line 43
    if-lez v6, :cond_2

    .line 44
    .line 45
    cmp-long v6, v10, v3

    .line 46
    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    add-int/2addr v5, v9

    .line 50
    const/4 v6, 0x2

    .line 51
    if-lt v5, v6, :cond_3

    .line 52
    .line 53
    return v9

    .line 54
    :cond_2
    move v5, v2

    .line 55
    move-wide v3, v10

    .line 56
    :cond_3
    const-wide/16 v6, 0x1f4

    .line 57
    .line 58
    :try_start_0
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 67
    .line 68
    .line 69
    return v2

    .line 70
    :cond_4
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_5

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    cmp-long p1, p1, v7

    .line 81
    .line 82
    if-lez p1, :cond_5

    .line 83
    .line 84
    return v9

    .line 85
    :cond_5
    return v2
.end method

.method private final waitForContactData(I)V
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    if-ge p1, v0, :cond_1

    .line 3
    .line 4
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const-wide/16 v0, 0xfa

    .line 20
    .line 21
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    new-instance v0, Lsf/f;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 31
    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :goto_0
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 45
    .line 46
    .line 47
    :cond_1
    :goto_1
    return-void
.end method

.method public static synthetic x(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendImage$lambda$0(Ljava/lang/String;Ljava/lang/String;Lj8/p;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic y(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->buildPostBody$lambda$1(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic z(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async$lambda$0(Lfg/a;Lh/Hchat/hooks/items/script/ScriptWaBridge;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final addChatroomMember(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    if-eqz p2, :cond_3

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    move p1, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v1, p1, p2}, Lg8/d;->a(Ljava/lang/String;Ljava/util/List;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :goto_0
    const/4 p2, 0x1

    .line 43
    if-ne p1, p2, :cond_3

    .line 44
    .line 45
    return p2

    .line 46
    :cond_3
    :goto_1
    return v0
.end method

.method public final addChatroomMember(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 47
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 49
    invoke-virtual {v1, p1, p2}, Lg8/d;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    return p2

    :cond_2
    :goto_0
    return v0
.end method

.method public final addContactLabel(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lg8/i;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-nez p1, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    return-object p1

    .line 28
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final bindPluginLog(Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->currentPluginName:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->currentPluginDir:Ljava/io/File;

    .line 4
    .line 5
    return-void
.end method

.method public final clearAllUnread()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 2
    .line 3
    invoke-virtual {v0}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {v0, v1}, Lya/i;->e(Landroid/content/Context;Z)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->f()Lh8/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 29
    .line 30
    const-string v2, "wxid_hchat_group_%"

    .line 31
    .line 32
    filled-new-array {v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "total"

    .line 37
    .line 38
    const-string v4, "SELECT IFNULL(SUM(unReadCount),0) AS total FROM rconversation WHERE username NOT LIKE ?"

    .line 39
    .line 40
    invoke-virtual {v0, v4, v2, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move v0, v1

    .line 50
    :goto_0
    if-nez v0, :cond_1

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    return v0

    .line 54
    :cond_1
    :goto_1
    return v1
.end method

.method public final clearUnread(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 12
    .line 13
    invoke-virtual {v1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->getHostContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, p1, v0}, Lya/i;->f(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    return v0
.end method

.method public final delChatroomMember(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    if-eqz p2, :cond_3

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    move p1, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v1, p1, p2}, Lg8/d;->d(Ljava/lang/String;Ljava/util/List;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :goto_0
    const/4 p2, 0x1

    .line 43
    if-ne p1, p2, :cond_3

    .line 44
    .line 45
    return p2

    .line 46
    :cond_3
    :goto_1
    return v0
.end method

.method public final delChatroomMember(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 47
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 49
    invoke-virtual {v1, p1, p2}, Lg8/d;->d(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    return p2

    :cond_2
    :goto_0
    return v0
.end method

.method public final delay(JLjava/lang/Runnable;)V
    .locals 4

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, La1/d;

    .line 5
    .line 6
    const/16 v1, 0x9

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, p3}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->runtime()Li8/e;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->p()Lo8/j;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    const-string v1, "script_delay_"

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callbackSeq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {v2, v3, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p3, v1, p1, p2, v0}, Lo8/j;->f(Ljava/lang/String;JLjava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    new-instance p3, Ljava/lang/Thread;

    .line 41
    .line 42
    new-instance v2, Lca/r;

    .line 43
    .line 44
    invoke-direct {v2, p0, p1, p2, v0}, Lca/r;-><init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;JLa1/d;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->callbackSeq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 50
    .line 51
    .line 52
    move-result-wide p1

    .line 53
    invoke-static {p1, p2, v1}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p3, v2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final deleteConversation(Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    return v1

    .line 25
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->f()Lh8/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lh8/a;->a(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    return p1

    .line 43
    :cond_3
    return v1
.end method

.method public final download(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/util/function/Consumer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;J",
            "Ljava/util/function/Consumer<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Leb/q0;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v3, p1

    .line 5
    move-object v4, p2

    .line 6
    move-object v5, p3

    .line 7
    move-wide v6, p4

    .line 8
    move-object v1, p6

    .line 9
    invoke-direct/range {v0 .. v7}, Leb/q0;-><init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;J)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final download(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/function/Consumer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/function/Consumer<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v4, 0x1e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    .line 16
    invoke-virtual/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->download(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/util/function/Consumer;)V

    return-void
.end method

.method public final downloadImage(Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 11
    new-instance v0, Leb/y0;

    invoke-direct {v0, p3, p0, p1, p2}, Leb/y0;-><init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    return-void
.end method

.method public final downloadImage(Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lab/e;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, p2, p0, p1, v1}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final downloadImages(Ljava/util/List;Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Lc9/n0;

    .line 2
    .line 3
    const/4 v5, 0x3

    .line 4
    move-object v3, p0

    .line 5
    move-object v4, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v1, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final downloadImages(Ljava/util/List;Ljava/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;",
            "Ljava/util/function/Consumer<",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;>;)V"
        }
    .end annotation

    .line 15
    new-instance v0, Lab/e;

    const/4 v1, 0x6

    invoke-direct {v0, p2, p0, p1, v1}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    return-void
.end method

.method public final downloadImg(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->imageDownloadRequest(Ljava/lang/Object;)Leb/a1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p1, Leb/a1;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p1, Leb/a1;->b:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v3, p1, Leb/a1;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget v5, p1, Leb/a1;->d:I

    .line 14
    .line 15
    iget v6, p1, Leb/a1;->e:I

    .line 16
    .line 17
    move-object v0, p0

    .line 18
    move-object v4, p2

    .line 19
    invoke-direct/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImgInternal(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final downloadImg(Ljava/lang/Object;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)V
    .locals 6

    .line 24
    new-instance v0, Leb/n0;

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Leb/n0;-><init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    return-void
.end method

.method public final downloadImg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 23
    invoke-static/range {v0 .. v8}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->downloadImgInternal$default(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/Object;)Ljava/io/File;

    return-void
.end method

.method public final downloadVideo(Ljava/lang/Object;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)V
    .locals 6

    .line 17
    new-instance v0, Leb/n0;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Leb/n0;-><init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/Object;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    return-void
.end method

.method public final downloadVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lme/hd/wauxv/plugin/api/callback/PluginCallBack$DownloadCallback;)V
    .locals 8

    .line 1
    new-instance v0, Lc9/p0;

    .line 2
    .line 3
    const/4 v7, 0x1

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    move-object v6, p5

    .line 10
    invoke-direct/range {v0 .. v7}, Lc9/p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final get(Ljava/lang/String;Ljava/util/Map;JLjava/util/function/Consumer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;J",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Leb/p0;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v3, p1

    .line 5
    move-object v4, p2

    .line 6
    move-wide v5, p3

    .line 7
    move-object v1, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Leb/p0;-><init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;J)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final get(Ljava/lang/String;Ljava/util/Map;Ljava/util/function/Consumer;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v3, 0x1e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    .line 15
    invoke-virtual/range {v0 .. v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->get(Ljava/lang/String;Ljava/util/Map;JLjava/util/function/Consumer;)V

    return-void
.end method

.method public final getAllUnreadCount()I
    .locals 5

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->f()Lh8/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 16
    .line 17
    const-string v2, "wxid_hchat_group_%"

    .line 18
    .line 19
    filled-new-array {v2}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    const-string v3, "total"

    .line 24
    .line 25
    const-string v4, "SELECT IFNULL(SUM(unReadCount),0) AS total FROM rconversation WHERE username NOT LIKE ?"

    .line 26
    .line 27
    invoke-virtual {v0, v4, v2, v3}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    return v0

    .line 36
    :catchall_0
    :cond_0
    return v1
.end method

.method public final getAvatarUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    .line 29
    invoke-virtual {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getAvatarUrl(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getAvatarUrl(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1, p2}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-nez p1, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    return-object p1

    .line 28
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final getChatroomName(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getGroupName(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getContactByLabelId(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lg8/i;->o(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_1
    :goto_0
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 22
    .line 23
    return-object p1
.end method

.method public final getContactByLabelName(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-virtual {v0}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_5

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 47
    .line 48
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/ContactLabelBean;->getLabelName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/ContactLabelBean;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/ContactLabelBean;->getLabelId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {v0, p1}, Lg8/i;->o(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    new-instance p1, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/ContactLabelBean;->getUserNameList()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    return-object p1

    .line 92
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    return-object p1

    .line 98
    :cond_6
    :goto_0
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 99
    .line 100
    return-object p1
.end method

.method public final getContactLabelList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/ContactLabelBean;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/i;->p()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getContactLabelListInfo()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getContactLabelList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lh/Hchat/hooks/api/model/ContactLabelBean;

    .line 25
    .line 26
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "labelId"

    .line 32
    .line 33
    iget-object v5, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string v4, "id"

    .line 39
    .line 40
    iget-object v5, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelId:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string v4, "labelName"

    .line 46
    .line 47
    iget-object v5, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const-string v4, "name"

    .line 53
    .line 54
    iget-object v5, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->labelName:Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    const-string v4, "userNameList"

    .line 60
    .line 61
    iget-object v5, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const-string v4, "usernameList"

    .line 67
    .line 68
    iget-object v5, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    const-string v4, "contactList"

    .line 74
    .line 75
    iget-object v2, v2, Lh/Hchat/hooks/api/model/ContactLabelBean;->userNameList:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    return-object v0
.end method

.method public final getDatabaseApi()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getDuration(Ljava/lang/String;)J
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-eqz p1, :cond_8

    .line 8
    .line 9
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_6

    .line 16
    .line 17
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getDurationCodec()Lme/yun/silk/SilkCodec;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {p1, v4}, Lme/yun/silk/SilkCodec;->getDuration(Ljava/lang/String;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v4

    .line 42
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    new-instance v4, Lsf/f;

    .line 49
    .line 50
    invoke-direct {v4, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object p1, v4

    .line 54
    :goto_0
    nop

    .line 55
    instance-of v4, p1, Lsf/f;

    .line 56
    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    move-object p1, v2

    .line 60
    :cond_2
    move-object v4, p1

    .line 61
    check-cast v4, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    cmp-long v4, v4, v0

    .line 68
    .line 69
    if-lez v4, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 p1, 0x0

    .line 73
    :goto_1
    check-cast p1, Ljava/lang/Long;

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    return-wide v0

    .line 82
    :cond_4
    new-instance p1, Landroid/media/MediaMetadataRetriever;

    .line 83
    .line 84
    invoke-direct {p1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 85
    .line 86
    .line 87
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {p1, v3}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/16 v3, 0x9

    .line 95
    .line 96
    invoke-virtual {p1, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-eqz v3, :cond_5

    .line 101
    .line 102
    invoke-static {v3}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-eqz v3, :cond_5

    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    goto :goto_2

    .line 113
    :catchall_1
    move-exception v0

    .line 114
    goto :goto_3

    .line 115
    :cond_5
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    goto :goto_4

    .line 120
    :goto_3
    new-instance v1, Lsf/f;

    .line 121
    .line 122
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    move-object v0, v1

    .line 126
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_6

    .line 131
    .line 132
    iget-object v3, p0, Lh/Hchat/hooks/items/script/ScriptWaBridge;->bridge:Lh/Hchat/hooks/items/script/ScriptPluginBridge;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v4, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v5, "\u8bfb\u53d6\u97f3\u9891\u65f6\u957f\u5931\u8d25: "

    .line 141
    .line 142
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v3, v1}, Lh/Hchat/hooks/items/script/ScriptPluginBridge;->log(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    :cond_6
    instance-of v1, v0, Lsf/f;

    .line 156
    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move-object v2, v0

    .line 161
    :goto_5
    check-cast v2, Ljava/lang/Number;

    .line 162
    .line 163
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 164
    .line 165
    .line 166
    :try_start_2
    invoke-virtual {p1}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 167
    .line 168
    .line 169
    :catchall_2
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 170
    .line 171
    .line 172
    move-result-wide v0

    .line 173
    :cond_8
    :goto_6
    return-wide v0
.end method

.method public final getFavorite(J)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-gtz v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->i()Lj8/p;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    iget-object v0, v0, Lj8/p;->f:Lj8/h;

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    :try_start_0
    invoke-virtual {v0, p1, p2}, Lj8/h;->r(J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {v0, p1}, Lj8/h;->i(Ljava/lang/Object;)Lj8/i;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->favoriteItemMap(Lj8/i;)Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move-object p1, v1

    .line 46
    goto :goto_1

    .line 47
    :goto_0
    new-instance p2, Lsf/f;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object p1, p2

    .line 53
    :goto_1
    nop

    .line 54
    instance-of p2, p1, Lsf/f;

    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    move-object v1, p1

    .line 60
    :goto_2
    check-cast v1, Ljava/util/Map;

    .line 61
    .line 62
    :cond_3
    :goto_3
    return-object v1
.end method

.method public final getFavoriteList(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->i()Lj8/p;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget-object v0, v0, Lj8/p;->f:Lj8/h;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    const/16 v3, 0xc8

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1, v2, v3}, Lr9/e0;->r(III)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {v0, p1}, Lj8/h;->q(I)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    move-object p1, v1

    .line 34
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Lj8/i;

    .line 58
    .line 59
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->favoriteItemMap(Lj8/i;)Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    new-instance v0, Lsf/f;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    instance-of p1, v0, Lsf/f;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    move-object v1, v0

    .line 79
    :goto_1
    check-cast v1, Ljava/util/List;

    .line 80
    .line 81
    :cond_3
    return-object v1
.end method

.method public final getFriendCity(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    :cond_1
    move-object p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    invoke-virtual {v1, p1}, Lg8/i;->L(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    const/16 p1, 0x3004

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lg8/i;->Y(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    invoke-virtual {v1, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    const/4 p1, 0x0

    .line 49
    :goto_0
    if-nez p1, :cond_5

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_5
    return-object p1

    .line 53
    :cond_6
    :goto_1
    return-object v0
.end method

.method public final getFriendDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    if-eqz p1, :cond_a

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_5

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    if-eqz p2, :cond_6

    .line 13
    .line 14
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto :goto_3

    .line 21
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    iget-object v1, v1, Lg8/d;->b:Lg8/i;

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    move-object v1, p1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-virtual {v1, p2, p1}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    goto :goto_0

    .line 38
    :cond_3
    move-object v1, v0

    .line 39
    :goto_0
    sget-object v2, Leb/d;->a:Leb/d;

    .line 40
    .line 41
    invoke-static {p2, p1}, Leb/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    invoke-virtual {v3, p2, p1}, Lg8/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move-object v3, v0

    .line 57
    :goto_1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-eqz v4, :cond_5

    .line 62
    .line 63
    invoke-virtual {v4, p2, p1}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    move-object p2, v0

    .line 69
    :goto_2
    filled-new-array {v1, v2, v3, p2}, [Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-direct {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_6

    .line 82
    .line 83
    return-object p2

    .line 84
    :cond_6
    :goto_3
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-eqz p2, :cond_9

    .line 89
    .line 90
    invoke-virtual {p2, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 97
    .line 98
    goto :goto_4

    .line 99
    :cond_7
    move-object v1, v0

    .line 100
    :goto_4
    invoke-virtual {p2, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    if-eqz p2, :cond_8

    .line 105
    .line 106
    iget-object v0, p2, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 107
    .line 108
    :cond_8
    filled-new-array {v1, v0, p1}, [Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    :cond_9
    return-object p1

    .line 117
    :cond_a
    :goto_5
    const-string p1, ""

    .line 118
    .line 119
    return-object p1
.end method

.method public final getFriendGender(Ljava/lang/String;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Lg8/i;->s(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    return v0
.end method

.method public final getFriendList()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lme/hd/wauxv/data/bean/info/FriendInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->rawFriendList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 29
    .line 30
    new-instance v3, Lme/hd/wauxv/data/bean/info/FriendInfo;

    .line 31
    .line 32
    iget-object v4, v2, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v6, v2, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v7, v2, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v8, v2, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v9, v2, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v10, v2, Lh/Hchat/hooks/api/model/WeChatContact;->encryptedUsername:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v11, v2, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v12, v2, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 49
    .line 50
    iget v13, v2, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 51
    .line 52
    iget v14, v2, Lh/Hchat/hooks/api/model/WeChatContact;->type:I

    .line 53
    .line 54
    invoke-direct/range {v3 .. v14}, Lme/hd/wauxv/data/bean/info/FriendInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    return-object v1
.end method

.method public final getFriendListInfo()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->rawFriendList()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 25
    .line 26
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "wxid"

    .line 32
    .line 33
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string v4, "nickname"

    .line 39
    .line 40
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    const-string v4, "remarkName"

    .line 46
    .line 47
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 48
    .line 49
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    const-string v4, "displayName"

    .line 53
    .line 54
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    const-string v4, "customWxId"

    .line 62
    .line 63
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 64
    .line 65
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget v4, v2, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 69
    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const-string v5, "gender"

    .line 75
    .line 76
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-string v4, "province"

    .line 80
    .line 81
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 82
    .line 83
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-string v4, "city"

    .line 87
    .line 88
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 89
    .line 90
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const-string v4, "region"

    .line 94
    .line 95
    invoke-virtual {v2}, Lh/Hchat/hooks/api/model/WeChatContact;->getRegion()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    const-string v4, "avatarUrl"

    .line 103
    .line 104
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 105
    .line 106
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    const-string v4, "avatarBackupUrl"

    .line 110
    .line 111
    iget-object v5, v2, Lh/Hchat/hooks/api/model/WeChatContact;->avatarBackupUrl:Ljava/lang/String;

    .line 112
    .line 113
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    iget v2, v2, Lh/Hchat/hooks/api/model/WeChatContact;->type:I

    .line 117
    .line 118
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    const-string v4, "type"

    .line 123
    .line 124
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_0
    return-object v0
.end method

.method public final getFriendName(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p1, :cond_5

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v0, v1

    .line 23
    :goto_0
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v2, v0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    move-object v2, v1

    .line 29
    :goto_1
    if-eqz v0, :cond_3

    .line 30
    .line 31
    iget-object v3, v0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_3
    move-object v3, v1

    .line 35
    :goto_2
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-object v1, v0, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 38
    .line 39
    :cond_4
    filled-new-array {v2, v3, v1, p1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_5
    :goto_3
    const-string p1, ""

    .line 49
    .line 50
    return-object p1
.end method

.method public final getFriendName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 51
    const-string v0, ""

    if-eqz p1, :cond_3

    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_2

    .line 52
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendDisplayName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendRemarkName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 54
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendNickName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 55
    filled-new-array {v0, p2, v1, p1}, [Ljava/lang/String;

    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    return-object v0
.end method

.method public final getFriendNickName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    return-object p1

    .line 32
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final getFriendProvince(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_6

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    :cond_1
    move-object p1, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    invoke-virtual {v1, p1}, Lg8/i;->L(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_3

    .line 31
    .line 32
    const/16 p1, 0x3005

    .line 33
    .line 34
    invoke-virtual {v1, p1}, Lg8/i;->Y(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    invoke-virtual {v1, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    const/4 p1, 0x0

    .line 49
    :goto_0
    if-nez p1, :cond_5

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_5
    return-object p1

    .line 53
    :cond_6
    :goto_1
    return-object v0
.end method

.method public final getFriendRegion(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lg8/i;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    :goto_0
    if-nez p1, :cond_2

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_2
    return-object p1

    .line 28
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final getFriendRemarkName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    return-object p1

    .line 32
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final getGroupList()Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lme/hd/wauxv/data/bean/info/GroupInfo;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->rawGroupContactMap()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->rawGroupList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-static {v1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 33
    .line 34
    iget-object v4, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 41
    .line 42
    iget-object v5, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->name:Ljava/lang/String;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    iget-object v7, v4, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    move-object v7, v6

    .line 51
    :goto_1
    iget-object v8, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 52
    .line 53
    filled-new-array {v5, v7, v8}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-direct {p0, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    new-instance v7, Lme/hd/wauxv/data/bean/info/GroupInfo;

    .line 62
    .line 63
    iget-object v8, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    iget-object v5, v4, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_1
    move-object v5, v6

    .line 71
    :goto_2
    filled-new-array {v5, v9}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-direct {p0, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v10

    .line 79
    if-eqz v4, :cond_2

    .line 80
    .line 81
    iget-object v6, v4, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 82
    .line 83
    :cond_2
    if-nez v6, :cond_3

    .line 84
    .line 85
    const-string v6, ""

    .line 86
    .line 87
    :cond_3
    move-object v11, v6

    .line 88
    iget-object v12, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->owner:Ljava/lang/String;

    .line 89
    .line 90
    iget-object v13, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 91
    .line 92
    iget-object v14, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct/range {v7 .. v14}, Lme/hd/wauxv/data/bean/info/GroupInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    return-object v2
.end method

.method public final getGroupListInfo()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->rawGroupContactMap()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->rawGroupList()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_4

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 29
    .line 30
    iget-object v4, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, Lh/Hchat/hooks/api/model/WeChatContact;

    .line 37
    .line 38
    iget-object v5, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->name:Ljava/lang/String;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    iget-object v7, v4, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move-object v7, v6

    .line 47
    :goto_1
    iget-object v8, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 48
    .line 49
    filled-new-array {v5, v7, v8}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-direct {p0, v5}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    iget-object v7, v4, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    move-object v7, v6

    .line 63
    :goto_2
    if-nez v7, :cond_2

    .line 64
    .line 65
    const-string v7, ""

    .line 66
    .line 67
    :cond_2
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v9, "roomId"

    .line 73
    .line 74
    iget-object v10, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 75
    .line 76
    invoke-interface {v8, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-string v9, "name"

    .line 80
    .line 81
    invoke-interface {v8, v9, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    iget-object v6, v4, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 87
    .line 88
    :cond_3
    filled-new-array {v6, v5}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-direct {p0, v4}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const-string v6, "nickname"

    .line 97
    .line 98
    invoke-interface {v8, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    const-string v4, "remarkName"

    .line 102
    .line 103
    invoke-interface {v8, v4, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    iget-object v4, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 107
    .line 108
    invoke-direct {p0, v4, v5, v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->groupDisplayName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    const-string v5, "displayName"

    .line 113
    .line 114
    invoke-interface {v8, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    const-string v4, "owner"

    .line 118
    .line 119
    iget-object v5, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->owner:Ljava/lang/String;

    .line 120
    .line 121
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberCount()I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const-string v5, "memberCount"

    .line 133
    .line 134
    invoke-interface {v8, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const-string v4, "memberList"

    .line 138
    .line 139
    iget-object v5, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {v8, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    const-string v4, "rawDisplayNames"

    .line 145
    .line 146
    iget-object v3, v3, Lh/Hchat/hooks/api/model/WeChatChatroom;->rawDisplayNames:Ljava/lang/String;

    .line 147
    .line 148
    invoke-interface {v8, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto/16 :goto_0

    .line 155
    .line 156
    :cond_4
    return-object v0
.end method

.method public final getGroupMemberCity(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendCity(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_2
    :goto_0
    const-string p1, ""

    .line 25
    .line 26
    return-object p1
.end method

.method public final getGroupMemberCount(Ljava/lang/String;)I
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lg8/d;->i(Ljava/lang/String;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_1
    invoke-virtual {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getGroupMemberList(Ljava/lang/String;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return p1
.end method

.method public final getGroupMemberGender(Ljava/lang/String;Ljava/lang/String;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendGender(Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final getGroupMemberList(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    invoke-direct {p0, p1, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->readGroupMemberIds(Ljava/lang/String;Z)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_1
    :goto_0
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 17
    .line 18
    return-object p1
.end method

.method public final getGroupMemberListInfo(Ljava/lang/String;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_1e

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_15

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x1

    .line 25
    invoke-direct {p0, p1, v3}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->readGroupMemberIds(Ljava/lang/String;Z)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    goto/16 :goto_14

    .line 36
    .line 37
    :cond_1
    const/4 v4, 0x0

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v1, p1}, Lg8/i;->u(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    if-eqz v7, :cond_4

    .line 65
    .line 66
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    check-cast v7, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v1, p1, v7}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move-object v5, v4

    .line 81
    :cond_4
    :goto_1
    sget-object v6, Ltf/u;->g:Ltf/u;

    .line 82
    .line 83
    if-nez v5, :cond_5

    .line 84
    .line 85
    move-object v5, v6

    .line 86
    :cond_5
    if-eqz v1, :cond_6

    .line 87
    .line 88
    invoke-virtual {v1, p1}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    goto :goto_2

    .line 93
    :cond_6
    move-object v7, v4

    .line 94
    :goto_2
    if-nez v7, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_7
    move-object v6, v7

    .line 98
    :goto_3
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_1d

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    check-cast v7, Ljava/lang/String;

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    invoke-virtual {v1, v7}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    goto :goto_5

    .line 121
    :cond_8
    move-object v8, v4

    .line 122
    :goto_5
    invoke-interface {v6, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    const-string v10, ""

    .line 127
    .line 128
    if-eqz v9, :cond_9

    .line 129
    .line 130
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    check-cast v9, Ljava/lang/String;

    .line 135
    .line 136
    if-nez v9, :cond_a

    .line 137
    .line 138
    :goto_6
    move-object v9, v10

    .line 139
    goto :goto_7

    .line 140
    :cond_9
    sget-object v9, Leb/d;->a:Leb/d;

    .line 141
    .line 142
    invoke-static {p1, v7}, Leb/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    if-nez v9, :cond_a

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_a
    :goto_7
    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    check-cast v11, Ljava/lang/String;

    .line 154
    .line 155
    if-eqz v2, :cond_b

    .line 156
    .line 157
    invoke-virtual {v2, p1, v7}, Lg8/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    goto :goto_8

    .line 162
    :cond_b
    move-object v12, v4

    .line 163
    :goto_8
    if-eqz v1, :cond_c

    .line 164
    .line 165
    invoke-virtual {v1, p1, v7}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v13

    .line 169
    goto :goto_9

    .line 170
    :cond_c
    move-object v13, v4

    .line 171
    :goto_9
    filled-new-array {v9, v11, v12, v13}, [Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    invoke-direct {p0, v11}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 180
    .line 181
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v13, "wxid"

    .line 185
    .line 186
    invoke-interface {v12, v13, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    if-eqz v8, :cond_d

    .line 190
    .line 191
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v13

    .line 195
    goto :goto_a

    .line 196
    :cond_d
    move-object v13, v4

    .line 197
    :goto_a
    filled-new-array {v11, v13, v7}, [Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    invoke-direct {p0, v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v7

    .line 205
    const-string v13, "displayName"

    .line 206
    .line 207
    invoke-interface {v12, v13, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    const-string v7, "groupNick"

    .line 211
    .line 212
    invoke-interface {v12, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    const-string v7, "groupNickName"

    .line 216
    .line 217
    invoke-interface {v12, v7, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    const-string v7, "rawGroupNickName"

    .line 221
    .line 222
    invoke-interface {v12, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    if-eqz v8, :cond_e

    .line 226
    .line 227
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 228
    .line 229
    goto :goto_b

    .line 230
    :cond_e
    move-object v7, v4

    .line 231
    :goto_b
    if-nez v7, :cond_f

    .line 232
    .line 233
    move-object v7, v10

    .line 234
    :cond_f
    const-string v9, "nickname"

    .line 235
    .line 236
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    if-eqz v8, :cond_10

    .line 240
    .line 241
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 242
    .line 243
    goto :goto_c

    .line 244
    :cond_10
    move-object v7, v4

    .line 245
    :goto_c
    if-nez v7, :cond_11

    .line 246
    .line 247
    move-object v7, v10

    .line 248
    :cond_11
    const-string v9, "remarkName"

    .line 249
    .line 250
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    if-eqz v8, :cond_12

    .line 254
    .line 255
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->customWxId:Ljava/lang/String;

    .line 256
    .line 257
    goto :goto_d

    .line 258
    :cond_12
    move-object v7, v4

    .line 259
    :goto_d
    if-nez v7, :cond_13

    .line 260
    .line 261
    move-object v7, v10

    .line 262
    :cond_13
    const-string v9, "customWxId"

    .line 263
    .line 264
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    if-eqz v8, :cond_14

    .line 268
    .line 269
    iget v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->gender:I

    .line 270
    .line 271
    goto :goto_e

    .line 272
    :cond_14
    const/4 v7, 0x0

    .line 273
    :goto_e
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    const-string v9, "gender"

    .line 278
    .line 279
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    if-eqz v8, :cond_15

    .line 283
    .line 284
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->province:Ljava/lang/String;

    .line 285
    .line 286
    goto :goto_f

    .line 287
    :cond_15
    move-object v7, v4

    .line 288
    :goto_f
    if-nez v7, :cond_16

    .line 289
    .line 290
    move-object v7, v10

    .line 291
    :cond_16
    const-string v9, "province"

    .line 292
    .line 293
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    if-eqz v8, :cond_17

    .line 297
    .line 298
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->city:Ljava/lang/String;

    .line 299
    .line 300
    goto :goto_10

    .line 301
    :cond_17
    move-object v7, v4

    .line 302
    :goto_10
    if-nez v7, :cond_18

    .line 303
    .line 304
    move-object v7, v10

    .line 305
    :cond_18
    const-string v9, "city"

    .line 306
    .line 307
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    if-eqz v8, :cond_19

    .line 311
    .line 312
    invoke-virtual {v8}, Lh/Hchat/hooks/api/model/WeChatContact;->getRegion()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    goto :goto_11

    .line 317
    :cond_19
    move-object v7, v4

    .line 318
    :goto_11
    if-nez v7, :cond_1a

    .line 319
    .line 320
    move-object v7, v10

    .line 321
    :cond_1a
    const-string v9, "region"

    .line 322
    .line 323
    invoke-interface {v12, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    if-eqz v8, :cond_1b

    .line 327
    .line 328
    iget-object v7, v8, Lh/Hchat/hooks/api/model/WeChatContact;->avatarUrl:Ljava/lang/String;

    .line 329
    .line 330
    goto :goto_12

    .line 331
    :cond_1b
    move-object v7, v4

    .line 332
    :goto_12
    if-nez v7, :cond_1c

    .line 333
    .line 334
    goto :goto_13

    .line 335
    :cond_1c
    move-object v10, v7

    .line 336
    :goto_13
    const-string v7, "avatarUrl"

    .line 337
    .line 338
    invoke-interface {v12, v7, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    goto/16 :goto_4

    .line 345
    .line 346
    :cond_1d
    :goto_14
    return-object v0

    .line 347
    :cond_1e
    :goto_15
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 348
    .line 349
    return-object p1
.end method

.method public final getGroupMemberName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    if-eqz p2, :cond_6

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_3

    .line 19
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    iget-object v0, v0, Lg8/d;->b:Lg8/i;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    move-object v0, p2

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {v0, p1, p2}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    move-object v2, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_3
    move-object v2, v1

    .line 39
    :goto_1
    sget-object v0, Leb/d;->a:Leb/d;

    .line 40
    .line 41
    invoke-static {p1, p2}, Leb/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2}, Lg8/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    move-object v4, v0

    .line 56
    goto :goto_2

    .line 57
    :cond_4
    move-object v4, v1

    .line 58
    :goto_2
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-virtual {v0, p1, p2}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    :cond_5
    move-object v5, v1

    .line 69
    invoke-virtual {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendName(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    move-object v7, p2

    .line 74
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :cond_6
    :goto_3
    const-string p1, ""

    .line 84
    .line 85
    return-object p1
.end method

.method public final getGroupMemberProvince(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendProvince(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_2
    :goto_0
    const-string p1, ""

    .line 25
    .line 26
    return-object p1
.end method

.method public final getGroupMemberRegion(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p0, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getFriendRegion(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_2
    :goto_0
    const-string p1, ""

    .line 25
    .line 26
    return-object p1
.end method

.method public final getGroupName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lg8/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v0, v1

    .line 23
    :goto_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v2, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_2
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {p0, p1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->firstNotBlank([Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_3
    :goto_1
    const-string p1, ""

    .line 43
    .line 44
    return-object p1
.end method

.method public final getGroupNickName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-eqz p2, :cond_7

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    :goto_0
    if-nez v0, :cond_3

    .line 32
    .line 33
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 34
    .line 35
    :cond_3
    invoke-interface {v0, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    if-nez p1, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    return-object p1

    .line 51
    :cond_5
    sget-object v0, Leb/d;->a:Leb/d;

    .line 52
    .line 53
    invoke-static {p1, p2}, Leb/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-nez p1, :cond_6

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_6
    return-object p1

    .line 61
    :cond_7
    :goto_1
    const-string p1, ""

    .line 62
    .line 63
    return-object p1
.end method

.method public final getGroupRemarkName(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    if-nez p1, :cond_2

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_2
    return-object p1

    .line 32
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final getLoginAlias()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/16 v1, 0x2a

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lg8/a;->b(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string v0, ""

    .line 25
    .line 26
    :cond_1
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getLoginWxid()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_2
    return-object v0
.end method

.method public final getLoginWxid()Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const-string v1, ""

    .line 3
    .line 4
    const/4 v2, 0x5

    .line 5
    if-ge v0, v2, :cond_3

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->a()Lg8/a;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v3}, Lg8/a;->c()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    const/4 v3, 0x0

    .line 34
    :goto_1
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    move-object v1, v3

    .line 38
    :goto_2
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-lez v3, :cond_2

    .line 51
    .line 52
    return-object v1

    .line 53
    :cond_2
    invoke-direct {p0, v2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->waitForContactData(I)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    return-object v1
.end method

.method public final getOfficialList()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatContact;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE \'gh\\_%\' ESCAPE \'\\\' OR (r.verifyFlag IS NOT NULL AND r.verifyFlag!=0)"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v1, v2}, Lg8/i;->U(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 16
    .line 17
    return-object v0
.end method

.method public final getSnsPost(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPost;
    .locals 3

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, ""

    .line 11
    .line 12
    :cond_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {v0}, Lp8/d0;->g()Lp8/h;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-virtual {v2, p1}, Lp8/h;->g(Ljava/lang/String;)Lp8/f;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, Lp8/f;->b:Ljava/lang/Object;

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    invoke-static {p1, v1}, Lp8/h;->j(Ljava/lang/Object;Ljava/lang/Long;)Lp8/g;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object p1, v1

    .line 47
    :goto_0
    if-eqz p1, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lp8/d0;->o(Lp8/g;)Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1

    .line 54
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final getSnsPostList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsPost;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x32

    .line 117
    invoke-virtual {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getSnsPostList(I)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getSnsPostList(I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsPost;",
            ">;"
        }
    .end annotation

    .line 105
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    .line 106
    sget-object v1, Ltf/t;->g:Ltf/t;

    if-eqz v0, :cond_5

    .line 107
    invoke-virtual {v0}, Lp8/d0;->g()Lp8/h;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2, v4, p1, v3}, Lp8/h;->h(Ljava/lang/String;IZ)Ljava/util/List;

    move-result-object v4

    :cond_0
    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v4

    .line 108
    :goto_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 109
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 110
    check-cast v4, Lp8/g;

    .line 111
    invoke-virtual {v0, v4}, Lp8/d0;->o(Lp8/g;)Lh/Hchat/hooks/api/model/WeChatSnsPost;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 112
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 113
    :cond_3
    new-instance v0, La9/h;

    const/16 v1, 0x19

    .line 114
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 115
    invoke-static {v2, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    if-gez p1, :cond_4

    move p1, v3

    .line 116
    :cond_4
    invoke-static {p1, v0}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v1
.end method

.method public final getSnsPostList(Ljava/lang/String;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsPost;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const-string p1, ""

    .line 12
    .line 13
    :cond_0
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto :goto_3

    .line 28
    :cond_1
    if-gtz p2, :cond_2

    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {v0}, Lp8/d0;->g()Lp8/h;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    iget-object v3, v0, Lp8/d0;->f:Lg8/a;

    .line 38
    .line 39
    invoke-virtual {v3}, Lg8/a;->c()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2, p1, p2, v3}, Lp8/h;->h(Ljava/lang/String;IZ)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 p1, 0x0

    .line 53
    :goto_0
    if-nez p1, :cond_4

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    move-object v1, p1

    .line 57
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_6

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lp8/g;

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Lp8/d0;->o(Lp8/g;)Lh/Hchat/hooks/api/model/WeChatSnsPost;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_6
    new-instance v0, La9/h;

    .line 89
    .line 90
    const/16 v1, 0x1a

    .line 91
    .line 92
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p2, p1}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1

    .line 104
    :cond_7
    :goto_3
    return-object v1
.end method

.method public final getTargetTalker()Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->b()Lq8/m;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lq8/m;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    xor-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v0, v1

    .line 39
    :goto_0
    if-eqz v0, :cond_1

    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->getTopActivity()Landroid/app/Activity;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v2, ""

    .line 47
    .line 48
    if-eqz v0, :cond_6

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_6

    .line 55
    .line 56
    const-string v3, "Contact_User"

    .line 57
    .line 58
    const-string v4, "Contact_Username"

    .line 59
    .line 60
    const-string v5, "Chat_User"

    .line 61
    .line 62
    const-string v6, "Chat_UserName"

    .line 63
    .line 64
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-static {v3}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_4

    .line 81
    .line 82
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-eqz v4, :cond_3

    .line 93
    .line 94
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_3

    .line 103
    .line 104
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    xor-int/lit8 v5, v5, 0x1

    .line 109
    .line 110
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_3
    move-object v4, v1

    .line 122
    :goto_1
    if-eqz v4, :cond_2

    .line 123
    .line 124
    move-object v1, v4

    .line 125
    :cond_4
    if-nez v1, :cond_5

    .line 126
    .line 127
    return-object v2

    .line 128
    :cond_5
    return-object v1

    .line 129
    :cond_6
    return-object v2
.end method

.method public final getTopActivity()Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->currentActivity()Lq8/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lq8/o;->a()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final getUnreadCount(Ljava/lang/String;)I
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->f()Lh8/a;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    iget-object v0, v0, Lh8/a;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 45
    .line 46
    filled-new-array {p1}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v2, "unReadCount"

    .line 51
    .line 52
    const-string v3, "SELECT unReadCount FROM rconversation WHERE username=? LIMIT 1"

    .line 53
    .line 54
    invoke-virtual {v0, v3, p1, v2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->queryFirstString(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    return p1

    .line 63
    :catchall_0
    :cond_3
    :goto_1
    return v1
.end method

.method public final insertSystemMsg(Ljava/lang/String;Ljava/lang/String;J)J
    .locals 9

    .line 1
    const-wide/16 v1, 0x0

    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->h()Lk8/e;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    move-object v4, p1

    .line 18
    move-object v5, p2

    .line 19
    move-wide v6, p3

    .line 20
    invoke-virtual/range {v3 .. v8}, Lk8/e;->e(Ljava/lang/String;Ljava/lang/String;JZ)J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    move-object p1, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    move-wide p1, v1

    .line 29
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_2

    .line 34
    :goto_1
    new-instance p2, Lsf/f;

    .line 35
    .line 36
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object p1, p2

    .line 40
    :goto_2
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    instance-of p3, p1, Lsf/f;

    .line 45
    .line 46
    if-eqz p3, :cond_1

    .line 47
    .line 48
    move-object p1, p2

    .line 49
    :cond_1
    check-cast p1, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 52
    .line 53
    .line 54
    move-result-wide p1

    .line 55
    return-wide p1
.end method

.method public final inviteChatroomMember(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    if-eqz p2, :cond_3

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    move p1, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {v1, p1, p2}, Lg8/d;->m(Ljava/lang/String;Ljava/util/List;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    :goto_0
    const/4 p2, 0x1

    .line 43
    if-ne p1, p2, :cond_3

    .line 44
    .line 45
    return p2

    .line 46
    :cond_3
    :goto_1
    return v0
.end method

.method public final inviteChatroomMember(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 47
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 48
    :cond_1
    invoke-static {}, Lj8/b;->f()Lg8/d;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 49
    invoke-virtual {v1, p1, p2}, Lg8/d;->m(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    return p2

    :cond_2
    :goto_0
    return v0
.end method

.method public final modifyContactLabelList(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1, p1, p2}, Lg8/i;->O(Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, 0x1

    .line 22
    if-ne p1, p2, :cond_1

    .line 23
    .line 24
    return p2

    .line 25
    :cond_1
    :goto_0
    return v0
.end method

.method public final modifyContactLabelList(Ljava/lang/String;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 26
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 28
    invoke-virtual {v1, p1, p2}, Lg8/i;->P(Ljava/lang/String;Ljava/util/List;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    return p2

    :cond_1
    :goto_0
    return v0
.end method

.method public final notify(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->interaction()Li8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->n()Lq8/r;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_b

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    move-object p1, v1

    .line 19
    :cond_0
    if-nez p2, :cond_1

    .line 20
    .line 21
    move-object p2, v1

    .line 22
    :cond_1
    const-string v1, "Hchat_wechat_api_notify_high"

    .line 23
    .line 24
    iget-object v2, v0, Lq8/r;->a:Landroid/content/Context;

    .line 25
    .line 26
    :try_start_0
    const-string v3, "notification"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/app/NotificationManager;

    .line 33
    .line 34
    if-nez v3, :cond_2

    .line 35
    .line 36
    goto/16 :goto_4

    .line 37
    .line 38
    :cond_2
    new-instance v4, Landroid/app/NotificationChannel;

    .line 39
    .line 40
    const-string v5, "Hchat \u901a\u77e5"

    .line 41
    .line 42
    const/4 v6, 0x4

    .line 43
    invoke-direct {v4, v1, v5, v6}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, v4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget v4, v4, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 54
    .line 55
    if-nez v4, :cond_3

    .line 56
    .line 57
    const v4, 0x108009b

    .line 58
    .line 59
    .line 60
    :cond_3
    new-instance v5, Landroid/app/Notification$Builder;

    .line 61
    .line 62
    invoke-direct {v5, v2, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, p1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v7

    .line 85
    invoke-virtual {p1, v7, v8}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const/4 p2, 0x1

    .line 90
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1, p2}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 v1, -0x1

    .line 103
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x0

    .line 107
    invoke-virtual {v0, p1}, Lq8/r;->a(Ljava/lang/String;)[Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const/4 v4, 0x0

    .line 112
    const-wide/32 v7, 0x7fffffff

    .line 113
    .line 114
    .line 115
    if-eqz v1, :cond_7

    .line 116
    .line 117
    array-length v9, v1

    .line 118
    if-nez v9, :cond_4

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_4
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-eqz v9, :cond_6

    .line 126
    .line 127
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    if-eqz v9, :cond_5

    .line 132
    .line 133
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 134
    .line 135
    .line 136
    move-result-wide v9

    .line 137
    const-wide/32 v11, 0xfffff

    .line 138
    .line 139
    .line 140
    and-long/2addr v9, v11

    .line 141
    shl-long/2addr v9, p2

    .line 142
    const-wide/32 v11, 0x4e000000

    .line 143
    .line 144
    .line 145
    or-long/2addr v9, v11

    .line 146
    int-to-long v11, v4

    .line 147
    or-long/2addr v9, v11

    .line 148
    and-long/2addr v9, v7

    .line 149
    long-to-int p2, v9

    .line 150
    const/high16 v9, 0xc000000

    .line 151
    .line 152
    invoke-static {v2, p2, v1, v9}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    goto :goto_1

    .line 157
    :cond_5
    throw p1

    .line 158
    :cond_6
    throw p1

    .line 159
    :cond_7
    :goto_0
    move-object p2, p1

    .line 160
    :goto_1
    if-eqz p2, :cond_8

    .line 161
    .line 162
    invoke-virtual {v5, p2}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :catchall_0
    move-exception p1

    .line 167
    goto :goto_3

    .line 168
    :cond_8
    :goto_2
    invoke-static {v2, p1}, Ld9/o;->f(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    if-eqz p2, :cond_9

    .line 173
    .line 174
    invoke-virtual {v5, p2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 175
    .line 176
    .line 177
    :cond_9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-eqz p2, :cond_a

    .line 182
    .line 183
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 184
    .line 185
    .line 186
    move-result-wide p1

    .line 187
    const-wide/32 v1, 0xffff

    .line 188
    .line 189
    .line 190
    and-long/2addr p1, v1

    .line 191
    shl-long/2addr p1, v6

    .line 192
    const-wide/32 v1, 0x4d000000

    .line 193
    .line 194
    .line 195
    or-long/2addr p1, v1

    .line 196
    int-to-long v1, v4

    .line 197
    const-wide/16 v9, 0xf

    .line 198
    .line 199
    and-long/2addr v1, v9

    .line 200
    or-long/2addr p1, v1

    .line 201
    and-long/2addr p1, v7

    .line 202
    long-to-int p1, p1

    .line 203
    invoke-virtual {v5}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 204
    .line 205
    .line 206
    move-result-object p2

    .line 207
    invoke-virtual {v3, p1, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_a
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    const-string v1, "\u901a\u77e5\u5931\u8d25: "

    .line 215
    .line 216
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v0, p1}, Lq8/r;->b(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :cond_b
    :goto_4
    return-void
.end method

.method public final post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;JLjava/util/function/Consumer;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/Map<",
            "**>;J",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Leb/q0;

    .line 2
    .line 3
    move-object v2, p0

    .line 4
    move-object v3, p1

    .line 5
    move-object v4, p2

    .line 6
    move-object v5, p3

    .line 7
    move-wide v6, p4

    .line 8
    move-object v1, p6

    .line 9
    invoke-direct/range {v0 .. v7}, Leb/q0;-><init>(Ljava/util/function/Consumer;Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/function/Consumer;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/Map<",
            "**>;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v4, 0x1e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    .line 16
    invoke-virtual/range {v0 .. v6}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;JLjava/util/function/Consumer;)V

    return-void
.end method

.method public final publishSnsPost(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    instance-of v2, p1, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    const/4 v2, 0x1

    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->isSuccess()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ne v3, v2, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getType()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const-string v5, ""

    .line 34
    .line 35
    sparse-switch v4, :sswitch_data_0

    .line 36
    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :sswitch_0
    const-string v4, "live_photo"

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_1

    .line 47
    .line 48
    goto/16 :goto_2

    .line 49
    .line 50
    :cond_1
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getLivePhotoList()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3}, Ltf/m;->I1(Ljava/util/List;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    check-cast v3, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    new-instance v4, Lorg/json/JSONObject;

    .line 63
    .line 64
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v5, "content"

    .line 68
    .line 69
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getContent()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v4, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v4, "imagePath"

    .line 78
    .line 79
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->getImagePath()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v4, "videoPath"

    .line 88
    .line 89
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->getVideoPath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {p1, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    const-string v4, "coverTimeMs"

    .line 98
    .line 99
    invoke-virtual {v3}, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->getCoverTimeMillis()J

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    invoke-virtual {p1, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {v0, p1}, Lp8/d0;->w(Lorg/json/JSONObject;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    :goto_1
    move p1, v1

    .line 113
    goto :goto_3

    .line 114
    :sswitch_1
    const-string v4, "video"

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-nez v3, :cond_3

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_3
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getContent()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getVideoPath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v0, v3, p1, v5, v5}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    goto :goto_3

    .line 136
    :sswitch_2
    const-string v4, "image"

    .line 137
    .line 138
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-nez v3, :cond_4

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_4
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getContent()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getImagePathList()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {v0, v3, p1, v5, v5}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    goto :goto_3

    .line 158
    :sswitch_3
    const-string v4, "text"

    .line 159
    .line 160
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    if-nez v3, :cond_5

    .line 165
    .line 166
    :goto_2
    goto :goto_1

    .line 167
    :cond_5
    invoke-virtual {p1}, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->getContent()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {v0, p1, v5, v5}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    :goto_3
    if-ne p1, v2, :cond_6

    .line 176
    .line 177
    return v2

    .line 178
    :cond_6
    return v1

    .line 179
    :sswitch_data_0
    .sparse-switch
        0x36452d -> :sswitch_3
        0x5faa95b -> :sswitch_2
        0x6b0147b -> :sswitch_1
        0x4824f11f -> :sswitch_0
    .end sparse-switch
.end method

.method public final queryHistoryMsg(Ljava/lang/String;JI)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "JI)",
            "Ljava/util/List<",
            "Lme/hd/wauxv/data/bean/MsgInfoBean;",
            ">;"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_3

    .line 10
    .line 11
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->m()Lk8/s;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_7

    .line 23
    .line 24
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance p1, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const-wide/16 v1, 0x0

    .line 37
    .line 38
    cmp-long v1, p2, v1

    .line 39
    .line 40
    if-gtz v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0, p4, p1}, Lk8/s;->f(ILjava/lang/String;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    new-instance p1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/16 v1, 0xc8

    .line 60
    .line 61
    invoke-static {v1, p4}, Ljava/lang/Math;->min(II)I

    .line 62
    .line 63
    .line 64
    move-result p4

    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-static {v1, p4}, Ljava/lang/Math;->max(II)I

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    iget-object v1, v0, Lk8/s;->a:Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 71
    .line 72
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_4

    .line 77
    .line 78
    const-string v1, ""

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_4
    invoke-virtual {v1, p1}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableForTalker(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_0
    invoke-virtual {v0, v1}, Lk8/s;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    if-nez v2, :cond_5

    .line 94
    .line 95
    const-string v2, "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM "

    .line 96
    .line 97
    const-string v3, " WHERE createTime>? ORDER BY createTime ASC, msgId ASC LIMIT ?"

    .line 98
    .line 99
    invoke-static {v2, v1, v3}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v0, v1, v2}, Lk8/s;->l(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-nez v2, :cond_5

    .line 124
    .line 125
    move-object p1, v1

    .line 126
    goto :goto_1

    .line 127
    :cond_5
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p3

    .line 135
    filled-new-array {p1, p2, p3}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const-string p2, "SELECT msgId, msgSvrId, type, status, isSend, createTime, talker, content, imgPath, reserved, transContent, flag FROM message WHERE talker=? AND createTime>? ORDER BY createTime ASC, msgId ASC LIMIT ?"

    .line 140
    .line 141
    invoke-virtual {v0, p2, p1}, Lk8/s;->l(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/ArrayList;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    :goto_1
    new-instance p2, Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-static {p1}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result p3

    .line 162
    if-eqz p3, :cond_6

    .line 163
    .line 164
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p3

    .line 168
    check-cast p3, Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 169
    .line 170
    new-instance p4, Lh/Hchat/hooks/items/script/ScriptMessageBean;

    .line 171
    .line 172
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-direct {p4, p3}, Lh/Hchat/hooks/items/script/ScriptMessageBean;-><init>(Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_6
    return-object p2

    .line 183
    :cond_7
    :goto_3
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 184
    .line 185
    return-object p1
.end method

.method public final refreshSnsTimeline()Z
    .locals 3

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lp8/d0;->s()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x1

    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    return v2

    .line 16
    :cond_0
    return v1
.end method

.method public final revokeMsg(J)Z
    .locals 11

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-gtz v2, :cond_0

    .line 7
    .line 8
    goto/16 :goto_5

    .line 9
    .line 10
    :cond_0
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    if-eqz v4, :cond_12

    .line 15
    .line 16
    iget-object v5, v4, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 17
    .line 18
    iget-object v6, v4, Lk8/g;->e:Lk8/s;

    .line 19
    .line 20
    if-gtz v2, :cond_1

    .line 21
    .line 22
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: msgId\u65e0\u6548"

    .line 23
    .line 24
    invoke-virtual {v4, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return v3

    .line 28
    :cond_1
    invoke-virtual {v6}, Lk8/s;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: messageStore\u672a\u5c31\u7eea"

    .line 35
    .line 36
    invoke-virtual {v4, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return v3

    .line 40
    :cond_2
    iget-object v2, v5, Lh/Hchat/dexkit/DexFinder;->revokeMsgCtor:Ljava/lang/reflect/Constructor;

    .line 41
    .line 42
    if-eqz v2, :cond_11

    .line 43
    .line 44
    invoke-virtual {v6, p1, p2}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v6, p1, p2}, Lk8/s;->d(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    :cond_3
    if-nez v2, :cond_4

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: \u672a\u627e\u5230\u6d88\u606f msgId/msgSvrId="

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {v4, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return v3

    .line 74
    :cond_4
    iget p1, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 75
    .line 76
    iget-wide v7, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 77
    .line 78
    const/4 p2, 0x1

    .line 79
    if-eq p1, p2, :cond_5

    .line 80
    .line 81
    new-instance p1, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string p2, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: \u53ea\u80fd\u64a4\u56de\u81ea\u5df1\u53d1\u9001\u7684\u6d88\u606f msgId="

    .line 84
    .line 85
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v4, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return v3

    .line 99
    :cond_5
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object p2, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->messageTableForTalker(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    :cond_6
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    const/4 p2, 0x0

    .line 119
    if-eqz p1, :cond_7

    .line 120
    .line 121
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p1, v7, v8}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageById(J)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    goto :goto_0

    .line 130
    :cond_7
    move-object p1, p2

    .line 131
    :goto_0
    if-nez p1, :cond_b

    .line 132
    .line 133
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    if-nez p1, :cond_9

    .line 138
    .line 139
    :cond_8
    move-object p1, p2

    .line 140
    goto :goto_1

    .line 141
    :cond_9
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-wide v9, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 146
    .line 147
    invoke-virtual {p1, v9, v10}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageById(J)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-eqz p1, :cond_a

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_a
    iget-wide v9, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 155
    .line 156
    cmp-long p1, v9, v0

    .line 157
    .line 158
    if-lez p1, :cond_8

    .line 159
    .line 160
    iget-object p1, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v6, v9, v10, p1}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-eqz p1, :cond_8

    .line 167
    .line 168
    iget-wide v9, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 169
    .line 170
    cmp-long v0, v9, v0

    .line 171
    .line 172
    if-lez v0, :cond_8

    .line 173
    .line 174
    iget-wide v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 175
    .line 176
    cmp-long v0, v9, v0

    .line 177
    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->database()Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iget-wide v9, p1, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 185
    .line 186
    invoke-virtual {v0, v9, v10}, Lh/Hchat/hooks/api/runtime/WeChatDatabaseApi;->nativeMessageById(J)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-eqz p1, :cond_8

    .line 191
    .line 192
    :cond_b
    :goto_1
    if-nez p1, :cond_f

    .line 193
    .line 194
    iget-object p1, v5, Lh/Hchat/dexkit/DexFinder;->localMessageCtor:Ljava/lang/reflect/Constructor;

    .line 195
    .line 196
    if-nez p1, :cond_c

    .line 197
    .line 198
    goto/16 :goto_3

    .line 199
    .line 200
    :cond_c
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    array-length p1, p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    iget-object v0, v5, Lh/Hchat/dexkit/DexFinder;->localMessageCtor:Ljava/lang/reflect/Constructor;

    .line 206
    .line 207
    if-nez p1, :cond_d

    .line 208
    .line 209
    :try_start_1
    new-array p1, v3, [Ljava/lang/Object;

    .line 210
    .line 211
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    goto :goto_2

    .line 216
    :cond_d
    iget-object p1, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 217
    .line 218
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    :goto_2
    if-nez p1, :cond_e

    .line 227
    .line 228
    goto/16 :goto_3

    .line 229
    .line 230
    :cond_e
    iget-wide v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgId:J

    .line 231
    .line 232
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    const-string v1, "field_msgId"

    .line 237
    .line 238
    const-string v5, "msgId"

    .line 239
    .line 240
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-wide v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 248
    .line 249
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    const-string v1, "field_msgSvrId"

    .line 254
    .line 255
    const-string v5, "msgSvrId"

    .line 256
    .line 257
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->type:I

    .line 265
    .line 266
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    const-string v1, "field_type"

    .line 271
    .line 272
    const-string v5, "type"

    .line 273
    .line 274
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->status:I

    .line 282
    .line 283
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    const-string v1, "field_status"

    .line 288
    .line 289
    const-string v5, "status"

    .line 290
    .line 291
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->isSend:I

    .line 299
    .line 300
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    const-string v1, "field_isSend"

    .line 305
    .line 306
    const-string v5, "isSend"

    .line 307
    .line 308
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-wide v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->createTime:J

    .line 316
    .line 317
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    const-string v1, "field_createTime"

    .line 322
    .line 323
    const-string v5, "createTime"

    .line 324
    .line 325
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->talker:Ljava/lang/String;

    .line 333
    .line 334
    const-string v1, "field_talker"

    .line 335
    .line 336
    const-string v5, "talker"

    .line 337
    .line 338
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->content:Ljava/lang/String;

    .line 346
    .line 347
    const-string v1, "field_content"

    .line 348
    .line 349
    const-string v5, "content"

    .line 350
    .line 351
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 359
    .line 360
    const-string v1, "field_imgPath"

    .line 361
    .line 362
    const-string v5, "imgPath"

    .line 363
    .line 364
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->reserved:Ljava/lang/String;

    .line 372
    .line 373
    const-string v1, "field_reserved"

    .line 374
    .line 375
    const-string v5, "reserved"

    .line 376
    .line 377
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->translatedContent:Ljava/lang/String;

    .line 385
    .line 386
    const-string v1, "field_transContent"

    .line 387
    .line 388
    const-string v5, "transContent"

    .line 389
    .line 390
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    iget v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->flag:I

    .line 398
    .line 399
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    const-string v1, "field_flag"

    .line 404
    .line 405
    const-string v5, "flag"

    .line 406
    .line 407
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    iget-object v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSource:Ljava/lang/String;

    .line 415
    .line 416
    const-string v1, "field_msgSource"

    .line 417
    .line 418
    const-string v5, "msgSource"

    .line 419
    .line 420
    filled-new-array {v1, v5}, [Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    invoke-static {p1, v0, v1}, Lk8/g;->B(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 425
    .line 426
    .line 427
    move-object p2, p1

    .line 428
    :catchall_0
    :goto_3
    move-object p1, p2

    .line 429
    :cond_f
    if-nez p1, :cond_10

    .line 430
    .line 431
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: \u539f\u751f\u6d88\u606f\u5bf9\u8c61\u4e3a\u7a7a msgId="

    .line 432
    .line 433
    const-string p2, " msgSvrId="

    .line 434
    .line 435
    invoke-static {v7, v8, p1, p2}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    iget-wide v0, v2, Lh/Hchat/hooks/api/model/WeChatMessage;->msgSvrId:J

    .line 440
    .line 441
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    invoke-virtual {v4, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    goto :goto_4

    .line 452
    :cond_10
    invoke-virtual {v4, p1}, Lk8/g;->s(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    :goto_4
    return v3

    .line 457
    :cond_11
    const-string p1, "\u64a4\u56de\u6d88\u606f\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 458
    .line 459
    invoke-virtual {v4, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    :cond_12
    :goto_5
    return v3
.end method

.method public final sendAppBrandMsg(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 1
    const/4 v6, 0x0

    .line 2
    const-string v7, ""

    .line 3
    .line 4
    const-string v3, ""

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move-object v5, p3

    .line 10
    move-object v4, p4

    .line 11
    invoke-virtual/range {v0 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->shareMiniProgram(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public final sendEmoji(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/g;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final sendFavorite(Ljava/lang/String;J)Z
    .locals 2

    if-eqz p1, :cond_2

    .line 32
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_1

    goto :goto_0

    .line 33
    :cond_1
    new-instance v0, Leb/s0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Leb/s0;-><init>(Ljava/lang/Object;JI)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final sendFavorite(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Leb/g;

    .line 20
    .line 21
    const/4 v1, 0x7

    .line 22
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public final sendFile(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/g;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 12
    new-instance v0, Leb/l;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1, p2, p3}, Leb/l;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    move-result p1

    return p1
.end method

.method public final sendImage(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/g;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 12
    new-instance v0, Leb/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2, p3}, Leb/l;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    move-result p1

    return p1
.end method

.method public final sendLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_a

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    if-eqz p4, :cond_a

    .line 13
    .line 14
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    goto/16 :goto_2

    .line 21
    .line 22
    :cond_1
    if-eqz p5, :cond_a

    .line 23
    .line 24
    invoke-static {p5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    :cond_2
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_a

    .line 37
    .line 38
    const-string v2, ""

    .line 39
    .line 40
    if-nez p2, :cond_3

    .line 41
    .line 42
    move-object p2, v2

    .line 43
    :cond_3
    if-nez p3, :cond_4

    .line 44
    .line 45
    move-object p3, v2

    .line 46
    :cond_4
    if-nez p6, :cond_5

    .line 47
    .line 48
    move-object p6, v2

    .line 49
    :cond_5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_9

    .line 54
    .line 55
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-nez v2, :cond_9

    .line 60
    .line 61
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_6

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_6
    invoke-static {p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_7

    .line 73
    .line 74
    const-string p6, "16"

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    invoke-virtual {p6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p6

    .line 81
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string v3, "<msg><location x=\""

    .line 84
    .line 85
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p4}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p4

    .line 92
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p4, "\" y=\""

    .line 96
    .line 97
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-static {p5}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p4

    .line 104
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p4, "\" scale=\""

    .line 108
    .line 109
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-static {p6}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p4

    .line 116
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p4, "\" label=\""

    .line 120
    .line 121
    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-static {p3}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p3

    .line 128
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string p3, "\" poiname=\""

    .line 132
    .line 133
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-static {p2}, Lk8/g;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string p2, "\" infourl=\"\" maptype=\"0\" poiid=\"\" isFromPoiList=\"false\" poiCategoryTips=\"\" poiBusinessHour=\"\" poiPhone=\"\" poiPriceTips=\"0.0\" buildingId=\"\" floorName=\"\" /></msg>"

    .line 144
    .line 145
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    if-eqz p3, :cond_8

    .line 157
    .line 158
    const-string p1, "\u53d1\u9001\u4f4d\u7f6e\u5931\u8d25: XML\u6784\u9020\u5931\u8d25"

    .line 159
    .line 160
    invoke-virtual {v1, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return v0

    .line 164
    :cond_8
    const/16 p3, 0x30

    .line 165
    .line 166
    invoke-virtual {v1, p3, p1, p2}, Lk8/g;->v(ILjava/lang/String;Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    return p1

    .line 171
    :cond_9
    :goto_1
    const-string p1, "\u53d1\u9001\u4f4d\u7f6e\u5931\u8d25: talker/\u7ecf\u7eac\u5ea6\u4e3a\u7a7a"

    .line 172
    .line 173
    invoke-virtual {v1, p1}, Lk8/g;->o(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    :cond_a
    :goto_2
    return v0
.end method

.method public final sendLocation(Ljava/lang/String;Lorg/json/JSONObject;)Z
    .locals 8

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 177
    :cond_0
    const-string v0, "poiName"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 178
    const-string v0, "label"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 179
    const-string v0, "x"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 180
    const-string v0, "y"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 181
    const-string v0, "scale"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    .line 182
    invoke-virtual/range {v1 .. v7}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendLocation(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final sendMediaMsg(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-nez p2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    new-instance v0, Lb0/s;

    .line 14
    .line 15
    const/4 v1, 0x6

    .line 16
    invoke-direct {v0, p1, p2, p3, v1}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 25
    return p1
.end method

.method public final sendOriginalImage(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/g;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final sendPat(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :cond_0
    :goto_0
    move/from16 v16, v6

    .line 15
    .line 16
    goto/16 :goto_d

    .line 17
    .line 18
    :cond_1
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    if-eqz v7, :cond_0

    .line 32
    .line 33
    iget-object v8, v7, Lk8/g;->b:Lm8/c;

    .line 34
    .line 35
    const-wide/16 v9, 0x0

    .line 36
    .line 37
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v11, v7, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 42
    .line 43
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_3

    .line 52
    .line 53
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    :cond_3
    move/from16 v16, v6

    .line 60
    .line 61
    goto/16 :goto_c

    .line 62
    .line 63
    :cond_4
    iget-object v1, v11, Lh/Hchat/dexkit/DexFinder;->serviceGetterMethod:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    if-eqz v1, :cond_15

    .line 66
    .line 67
    iget-object v1, v11, Lh/Hchat/dexkit/DexFinder;->patCreatePairMethod:Ljava/lang/reflect/Method;

    .line 68
    .line 69
    if-eqz v1, :cond_15

    .line 70
    .line 71
    iget-object v1, v11, Lh/Hchat/dexkit/DexFinder;->patSuffixMethod:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    if-eqz v1, :cond_15

    .line 74
    .line 75
    iget-object v1, v11, Lh/Hchat/dexkit/DexFinder;->sendPatSceneCtor:Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    if-eqz v1, :cond_15

    .line 78
    .line 79
    iget-object v1, v7, Lk8/g;->c:Lg8/a;

    .line 80
    .line 81
    invoke-virtual {v1}, Lg8/a;->c()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v7}, Lk8/g;->l()V

    .line 86
    .line 87
    .line 88
    :try_start_0
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->serviceGetterMethod:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    if-nez v3, :cond_5

    .line 91
    .line 92
    const/4 v3, 0x0

    .line 93
    :goto_1
    move-object v14, v3

    .line 94
    goto :goto_5

    .line 95
    :cond_5
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->patCreatePairMethod:Ljava/lang/reflect/Method;

    .line 96
    .line 97
    if-eqz v3, :cond_6

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    goto :goto_2

    .line 104
    :cond_6
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->patExtensionClass:Ljava/lang/Class;

    .line 105
    .line 106
    :goto_2
    invoke-virtual {v7, v3}, Lk8/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-eqz v3, :cond_7

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_7
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->patExtensionClass:Ljava/lang/Class;

    .line 114
    .line 115
    if-eqz v3, :cond_8

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    goto :goto_3

    .line 122
    :cond_8
    new-array v3, v6, [Ljava/lang/Class;

    .line 123
    .line 124
    :goto_3
    array-length v4, v3

    .line 125
    move v13, v6

    .line 126
    :goto_4
    if-ge v13, v4, :cond_a

    .line 127
    .line 128
    aget-object v14, v3, v13

    .line 129
    .line 130
    invoke-virtual {v7, v14}, Lk8/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    if-eqz v14, :cond_9

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    add-int/lit8 v13, v13, 0x1

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_a
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->patExtensionClass:Ljava/lang/Class;

    .line 141
    .line 142
    invoke-virtual {v7, v3}, Lk8/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    goto :goto_1

    .line 147
    :goto_5
    if-nez v14, :cond_b

    .line 148
    .line 149
    const-string v0, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: \u62cd\u4e00\u62cd\u670d\u52a1\u4e3a\u7a7a"

    .line 150
    .line 151
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return v6

    .line 155
    :catchall_0
    move-exception v0

    .line 156
    move/from16 v16, v6

    .line 157
    .line 158
    goto/16 :goto_a

    .line 159
    .line 160
    :cond_b
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->patCanSendMethod:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    .line 162
    const-string v13, " pattedUser="

    .line 163
    .line 164
    if-eqz v3, :cond_c

    .line 165
    .line 166
    :try_start_1
    filled-new-array {v12, v0, v2}, [Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v3, v14, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    instance-of v4, v3, Ljava/lang/Boolean;

    .line 175
    .line 176
    if-eqz v4, :cond_c

    .line 177
    .line 178
    check-cast v3, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-nez v3, :cond_c

    .line 185
    .line 186
    new-instance v1, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    .line 190
    .line 191
    const-string v3, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: \u5fae\u4fe1\u539f\u751f\u6821\u9a8c\u4e0d\u5141\u8bb8 talker="

    .line 192
    .line 193
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return v6

    .line 213
    :cond_c
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->patSuffixMethod:Ljava/lang/reflect/Method;

    .line 214
    .line 215
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-static {v3, v14, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    instance-of v4, v3, Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    .line 225
    const-string v15, ""

    .line 226
    .line 227
    if-eqz v4, :cond_d

    .line 228
    .line 229
    :try_start_2
    check-cast v3, Ljava/lang/String;

    .line 230
    .line 231
    goto :goto_6

    .line 232
    :cond_d
    move-object v3, v15

    .line 233
    :goto_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 234
    .line 235
    .line 236
    move-result-wide v16

    .line 237
    const-wide/16 v18, 0x3e8

    .line 238
    .line 239
    move-wide/from16 v20, v9

    .line 240
    .line 241
    div-long v9, v16, v18
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 242
    .line 243
    long-to-int v4, v9

    .line 244
    :try_start_3
    iget-object v9, v11, Lh/Hchat/dexkit/DexFinder;->sendPatSceneCtor:Ljava/lang/reflect/Constructor;

    .line 245
    .line 246
    if-nez v9, :cond_e

    .line 247
    .line 248
    :catchall_1
    move/from16 v16, v6

    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_e
    invoke-static {v5, v5}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    iget-object v10, v11, Lh/Hchat/dexkit/DexFinder;->sendPatSceneCtor:Ljava/lang/reflect/Constructor;

    .line 256
    .line 257
    filled-new-array {v9, v0, v2, v12}, [Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-static {v10, v9}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    new-instance v10, Ljava/util/IdentityHashMap;

    .line 266
    .line 267
    invoke-direct {v10}, Ljava/util/IdentityHashMap;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-static {v10}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 271
    .line 272
    .line 273
    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 274
    move/from16 v16, v6

    .line 275
    .line 276
    const/4 v6, 0x4

    .line 277
    :try_start_4
    invoke-static {v9, v0, v2, v6, v10}, Lk8/g;->i(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ILjava/util/Set;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v15
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 281
    :catchall_2
    :goto_7
    :try_start_5
    invoke-static {v15}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-nez v6, :cond_f

    .line 286
    .line 287
    move-object v1, v15

    .line 288
    :cond_f
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 289
    .line 290
    .line 291
    move-result v6

    .line 292
    if-eqz v6, :cond_10

    .line 293
    .line 294
    const-string v0, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: \u81ea\u8eabwxid\u4e3a\u7a7a"

    .line 295
    .line 296
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    :goto_8
    move/from16 v6, v16

    .line 300
    .line 301
    goto/16 :goto_b

    .line 302
    .line 303
    :catchall_3
    move-exception v0

    .line 304
    goto/16 :goto_a

    .line 305
    .line 306
    :cond_10
    iget-object v6, v11, Lh/Hchat/dexkit/DexFinder;->patCreatePairMethod:Ljava/lang/reflect/Method;

    .line 307
    .line 308
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-static {v6, v14, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    instance-of v3, v1, Landroid/util/Pair;

    .line 321
    .line 322
    if-nez v3, :cond_11

    .line 323
    .line 324
    const-string v0, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: \u672c\u5730\u6d88\u606f\u7ed3\u679c\u65e0\u6548"

    .line 325
    .line 326
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_8

    .line 330
    :cond_11
    check-cast v1, Landroid/util/Pair;

    .line 331
    .line 332
    iget-object v3, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 333
    .line 334
    instance-of v4, v3, Ljava/lang/Number;

    .line 335
    .line 336
    if-eqz v4, :cond_14

    .line 337
    .line 338
    check-cast v3, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 341
    .line 342
    .line 343
    move-result-wide v3

    .line 344
    cmp-long v3, v3, v20

    .line 345
    .line 346
    if-gtz v3, :cond_12

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_12
    iget-object v3, v11, Lh/Hchat/dexkit/DexFinder;->sendPatSceneCtor:Ljava/lang/reflect/Constructor;

    .line 350
    .line 351
    filled-new-array {v1, v0, v2, v12}, [Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-static {v3, v4}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v8, v3}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    if-nez v3, :cond_13

    .line 364
    .line 365
    new-instance v4, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 368
    .line 369
    .line 370
    const-string v5, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: \u7f51\u7edc\u5165\u961f\u5931\u8d25 msgId="

    .line 371
    .line 372
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    const-string v5, " createTime="

    .line 381
    .line 382
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 386
    .line 387
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    const-string v1, " talker="

    .line 391
    .line 392
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :cond_13
    move v6, v3

    .line 412
    goto :goto_b

    .line 413
    :cond_14
    :goto_9
    const-string v0, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: \u672c\u5730\u6d88\u606f\u63d2\u5165\u5931\u8d25"

    .line 414
    .line 415
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 416
    .line 417
    .line 418
    goto :goto_8

    .line 419
    :goto_a
    new-instance v1, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v2, "\u53d1\u9001\u62cd\u4e00\u62cd\u5f02\u5e38: "

    .line 422
    .line 423
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    goto/16 :goto_8

    .line 441
    .line 442
    :goto_b
    return v6

    .line 443
    :cond_15
    move/from16 v16, v6

    .line 444
    .line 445
    const-string v0, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: API \u672a\u5c31\u7eea"

    .line 446
    .line 447
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    return v16

    .line 451
    :goto_c
    const-string v0, "\u53d1\u9001\u62cd\u4e00\u62cd\u5931\u8d25: talker/pattedUser \u4e3a\u7a7a"

    .line 452
    .line 453
    invoke-virtual {v7, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    :goto_d
    return v16
.end method

.method public final sendQuoteMsg(Ljava/lang/String;JLjava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    cmp-long v1, p2, v1

    .line 14
    .line 15
    if-gtz v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1, p2, p3, p1, p4}, Lk8/g;->u(JLjava/lang/String;Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_2
    :goto_0
    return v0
.end method

.method public final sendQuoteMsg(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 0

    .line 30
    invoke-virtual {p0, p1, p3, p4, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendQuoteMsg(Ljava/lang/String;JLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final sendShareCard(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-eqz p2, :cond_2

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, p1, p2}, Lk8/g;->w(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    :goto_0
    return v0
.end method

.method public final sendText(Ljava/lang/String;Ljava/lang/String;Ljava/util/function/Consumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/function/Consumer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 58
    new-instance v0, Leb/y0;

    invoke-direct {v0, p0, p3, p1, p2}, Leb/y0;-><init>(Lh/Hchat/hooks/items/script/ScriptWaBridge;Ljava/util/function/Consumer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->async(Lfg/a;)V

    return-void
.end method

.method public final sendText(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_4

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    invoke-direct {p0, p1, p2}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->parseAtContent(Ljava/lang/String;Ljava/lang/String;)Leb/b1;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, p1, p2}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    iget-object p2, v1, Leb/b1;->b:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    iget-object v1, v1, Leb/b1;->a:Ljava/lang/String;

    .line 43
    .line 44
    if-eqz v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0, p1, v1}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    return p1

    .line 51
    :cond_3
    invoke-virtual {v0, p1, v1, p2}, Lk8/g;->y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :cond_4
    :goto_0
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public final sendVideo(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/g;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final sendVoice(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Leb/g;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1, p1, p2}, Leb/g;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public final sendVoice(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 2

    .line 12
    new-instance v0, Leb/v0;

    const/4 v1, 0x0

    invoke-direct {v0, p3, p1, p2, v1}, Leb/v0;-><init>(ILjava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    move-result p1

    return p1
.end method

.method public final sendXmlMsg(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-eqz p2, :cond_2

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, p1, p2}, Lk8/g;->z(Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_2
    :goto_0
    return v0
.end method

.method public final shareFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p3, :cond_2

    .line 11
    .line 12
    invoke-static {p3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Lc9/k;

    .line 20
    .line 21
    const/4 v7, 0x3

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v2, p1

    .line 24
    move-object v3, p2

    .line 25
    move-object v5, p3

    .line 26
    move-object v6, p4

    .line 27
    invoke-direct/range {v1 .. v7}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 36
    return p1
.end method

.method public final shareMiniProgram(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 10

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p4, :cond_2

    .line 11
    .line 12
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Leb/r0;

    .line 20
    .line 21
    const/4 v9, 0x1

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    move-object v5, p4

    .line 26
    move-object v6, p5

    .line 27
    move-object/from16 v7, p6

    .line 28
    .line 29
    move-object/from16 v8, p7

    .line 30
    .line 31
    invoke-direct/range {v1 .. v9}, Leb/r0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    return p1

    .line 39
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 40
    return p1
.end method

.method public final shareMusic(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 10

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p4, :cond_3

    .line 11
    .line 12
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-eqz p5, :cond_3

    .line 20
    .line 21
    invoke-static {p5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    new-instance v1, Leb/r0;

    .line 29
    .line 30
    const/4 v9, 0x0

    .line 31
    move-object v2, p1

    .line 32
    move-object v3, p2

    .line 33
    move-object v4, p3

    .line 34
    move-object v5, p4

    .line 35
    move-object v6, p5

    .line 36
    move-object/from16 v7, p6

    .line 37
    .line 38
    move-object/from16 v8, p7

    .line 39
    .line 40
    invoke-direct/range {v1 .. v9}, Leb/r0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 49
    return p1
.end method

.method public final shareMusicVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)Z
    .locals 12

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p4, :cond_3

    .line 11
    .line 12
    invoke-static/range {p4 .. p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-eqz p5, :cond_3

    .line 20
    .line 21
    invoke-static/range {p5 .. p5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    new-instance v1, Leb/o0;

    .line 29
    .line 30
    move-object v2, p1

    .line 31
    move-object v3, p2

    .line 32
    move-object v4, p3

    .line 33
    move-object/from16 v5, p4

    .line 34
    .line 35
    move-object/from16 v6, p5

    .line 36
    .line 37
    move-object/from16 v7, p6

    .line 38
    .line 39
    move/from16 v8, p7

    .line 40
    .line 41
    move-object/from16 v9, p8

    .line 42
    .line 43
    move-object/from16 v10, p9

    .line 44
    .line 45
    move-object/from16 v11, p10

    .line 46
    .line 47
    invoke-direct/range {v1 .. v11}, Leb/o0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[BLjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    return p1

    .line 55
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 56
    return p1
.end method

.method public final shareText(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Leb/l;

    .line 20
    .line 21
    const/4 v1, 0x3

    .line 22
    invoke-direct {v0, v1, p1, p2, p3}, Leb/l;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1

    .line 30
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 31
    return p1
.end method

.method public final shareVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 9

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p4, :cond_2

    .line 11
    .line 12
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Leb/u0;

    .line 20
    .line 21
    const/4 v8, 0x1

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    move-object v5, p4

    .line 26
    move-object v6, p5

    .line 27
    move-object v7, p6

    .line 28
    invoke-direct/range {v1 .. v8}, Leb/u0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final shareWebpage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z
    .locals 9

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p4, :cond_2

    .line 11
    .line 12
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v1, Leb/u0;

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    move-object v2, p1

    .line 23
    move-object v3, p2

    .line 24
    move-object v4, p3

    .line 25
    move-object v5, p4

    .line 26
    move-object v6, p5

    .line 27
    move-object v7, p6

    .line 28
    invoke-direct/range {v1 .. v8}, Leb/u0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v1}, Lh/Hchat/hooks/items/script/ScriptWaBridge;->sendMedia(Lfg/l;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 37
    return p1
.end method

.method public final uploadDeviceStep(J)Z
    .locals 16

    .line 1
    move-wide/from16 v0, p1

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-gtz v2, :cond_0

    .line 9
    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    if-eqz v4, :cond_4

    .line 17
    .line 18
    iget-object v5, v4, Lk8/g;->b:Lm8/c;

    .line 19
    .line 20
    iget-object v6, v4, Lk8/g;->a:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    const-string v7, "\u4e0a\u4f20\u6b65\u6570"

    .line 23
    .line 24
    if-gtz v2, :cond_1

    .line 25
    .line 26
    const-string v0, "\u4e0a\u4f20\u6b65\u6570\u5931\u8d25: step\u65e0\u6548"

    .line 27
    .line 28
    invoke-virtual {v4, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return v3

    .line 32
    :cond_1
    iget-object v2, v6, Lh/Hchat/dexkit/DexFinder;->uploadDeviceStepCtor:Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-virtual {v4}, Lk8/g;->l()V

    .line 37
    .line 38
    .line 39
    const-wide/32 v8, 0x7fffffff

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    long-to-int v0, v0

    .line 47
    iget-object v1, v6, Lh/Hchat/dexkit/DexFinder;->uploadDeviceStepCtor:Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    const-string v8, ""

    .line 50
    .line 51
    const-string v9, "gh_43f2581f6fd6"

    .line 52
    .line 53
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/16 v6, 0xb

    .line 58
    .line 59
    invoke-virtual {v2, v6, v3}, Ljava/util/Calendar;->set(II)V

    .line 60
    .line 61
    .line 62
    const/16 v6, 0xc

    .line 63
    .line 64
    invoke-virtual {v2, v6, v3}, Ljava/util/Calendar;->set(II)V

    .line 65
    .line 66
    .line 67
    const/16 v6, 0xd

    .line 68
    .line 69
    invoke-virtual {v2, v6, v3}, Ljava/util/Calendar;->set(II)V

    .line 70
    .line 71
    .line 72
    const/16 v6, 0xe

    .line 73
    .line 74
    invoke-virtual {v2, v6, v3}, Ljava/util/Calendar;->set(II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v10

    .line 81
    const-wide/16 v12, 0x3e8

    .line 82
    .line 83
    div-long/2addr v10, v12

    .line 84
    long-to-int v2, v10

    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 90
    .line 91
    .line 92
    move-result-wide v14

    .line 93
    div-long/2addr v14, v12

    .line 94
    long-to-int v2, v14

    .line 95
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    invoke-static {}, Lk8/g;->b()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    const/4 v2, 0x1

    .line 108
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v14

    .line 112
    filled-new-array/range {v8 .. v14}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v1, v2}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v5, v1}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    if-eqz v1, :cond_2

    .line 130
    .line 131
    const-string v5, "\u5df2\u53d1\u9001"

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :catchall_0
    move-exception v0

    .line 135
    goto :goto_1

    .line 136
    :cond_2
    const-string v5, "\u53d1\u9001\u5931\u8d25"

    .line 137
    .line 138
    :goto_0
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v5, ": step="

    .line 142
    .line 143
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v4, v0}, Lk8/g;->o(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    return v1

    .line 157
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string v2, "\u4e0a\u4f20\u6b65\u6570\u5f02\u5e38: "

    .line 160
    .line 161
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-virtual {v4, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return v3

    .line 179
    :cond_3
    const-string v0, "\u4e0a\u4f20\u6b65\u6570\u5931\u8d25: API\u672a\u5c31\u7eea"

    .line 180
    .line 181
    invoke-virtual {v4, v0}, Lk8/g;->o(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    :cond_4
    :goto_2
    return v3
.end method

.method public final uploadLivePhoto(Ljava/lang/String;)Z
    .locals 8

    .line 36
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 37
    const-string v7, ""

    const-wide/16 v1, 0x0

    const-string v3, ""

    const-string v5, ""

    const-string v6, ""

    move-object v4, p1

    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final uploadLivePhoto(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 34
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 35
    const-string v7, ""

    const-wide/16 v1, 0x0

    const-string v3, ""

    const-string v6, ""

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final uploadLivePhoto(Lorg/json/JSONObject;)Z
    .locals 8

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string v7, ""

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    const-string v6, ""

    .line 16
    .line 17
    move-object v4, v3

    .line 18
    move-object v5, v3

    .line 19
    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0, p1}, Lp8/d0;->w(Lorg/json/JSONObject;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    :goto_0
    const/4 v0, 0x1

    .line 29
    if-ne p1, v0, :cond_1

    .line 30
    .line 31
    return v0

    .line 32
    :cond_1
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public final uploadText(Ljava/lang/String;)Z
    .locals 3

    .line 46
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 47
    const-string v2, ""

    invoke-virtual {v0, p1, v2, v2}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public final uploadText(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 44
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return v1
.end method

.method public final uploadText(Lorg/json/JSONObject;)Z
    .locals 6

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v2, v2, v2}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string v3, "content"

    .line 18
    .line 19
    invoke-virtual {p1, v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v4, "sdkId"

    .line 24
    .line 25
    invoke-virtual {p1, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "sdkAppName"

    .line 30
    .line 31
    invoke-virtual {p1, v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, v3, v4, p1}, Lp8/d0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    :goto_0
    const/4 v0, 0x1

    .line 40
    if-ne p1, v0, :cond_1

    .line 41
    .line 42
    return v0

    .line 43
    :cond_1
    return v1
.end method

.method public final uploadTextAndLivePhoto(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v7, ""

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    const-string v5, ""

    .line 12
    .line 13
    const-string v6, ""

    .line 14
    .line 15
    move-object v3, p1

    .line 16
    move-object v4, p2

    .line 17
    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const/4 p2, 0x1

    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    return p2

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1
.end method

.method public final uploadTextAndLivePhoto(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 27
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 28
    const-string v7, ""

    const-wide/16 v1, 0x0

    const-string v6, ""

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final uploadTextAndLivePhoto(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 29
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    .line 30
    const-string v5, ""

    const-wide/16 v1, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return v8
.end method

.method public final uploadTextAndLivePhoto(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 31
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    .line 32
    invoke-virtual/range {v0 .. v7}, Lp8/d0;->v(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return v8
.end method

.method public final uploadTextAndLivePhoto(Lorg/json/JSONObject;)Z
    .locals 2

    .line 33
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v0, p1}, Lp8/d0;->w(Lorg/json/JSONObject;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public final uploadTextAndPicList(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 116
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 117
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :goto_0
    move-object v4, p2

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p2, Ltf/t;->g:Ltf/t;

    goto :goto_0

    :goto_2
    const/4 v2, 0x0

    .line 118
    const-string v3, ""

    move-object v5, v3

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lp8/d0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    return p2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final uploadTextAndPicList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 109
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 110
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :goto_0
    move-object v4, p2

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p2, Ltf/t;->g:Ltf/t;

    goto :goto_0

    :goto_2
    const/4 v2, 0x0

    move-object v1, p1

    move-object v3, p3

    move-object v5, p4

    .line 111
    invoke-virtual/range {v0 .. v5}, Lp8/d0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    return p2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final uploadTextAndPicList(Ljava/lang/String;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;)Z"
        }
    .end annotation

    .line 112
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 113
    const-string v2, ""

    invoke-virtual {v0, p1, p2, v2, v2}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return v1
.end method

.method public final uploadTextAndPicList(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    .line 114
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 115
    invoke-virtual {v0, p1, p2, p3, p4}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return v1
.end method

.method public final uploadTextAndPicList(Lorg/json/JSONObject;)Z
    .locals 9

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 13
    .line 14
    invoke-virtual {v0, v2, p1, v2, v2}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v4, "picPathList"

    .line 25
    .line 26
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    if-eqz v4, :cond_3

    .line 31
    .line 32
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    move v6, v1

    .line 37
    :goto_0
    if-lt v6, v5, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    invoke-virtual {v4, v6, v2}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-nez v8, :cond_2

    .line 60
    .line 61
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    :goto_1
    const-string v4, "picPath"

    .line 68
    .line 69
    invoke-static {v4, v2, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_4

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    :cond_4
    const-string v4, "content"

    .line 83
    .line 84
    invoke-virtual {p1, v4, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    const-string v5, "sdkId"

    .line 89
    .line 90
    invoke-virtual {p1, v5, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    const-string v6, "sdkAppName"

    .line 95
    .line 96
    invoke-virtual {p1, v6, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {v0, v4, v3, v5, p1}, Lp8/d0;->x(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    :goto_2
    const/4 v0, 0x1

    .line 105
    if-ne p1, v0, :cond_5

    .line 106
    .line 107
    return v0

    .line 108
    :cond_5
    return v1
.end method

.method public final uploadTextAndVideo(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, ""

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v2, v2}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 p2, 0x1

    .line 15
    if-ne p1, p2, :cond_0

    .line 16
    .line 17
    return p2

    .line 18
    :cond_0
    return v1
.end method

.method public final uploadTextAndVideo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 19
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 20
    invoke-virtual {v0, p1, p2, p3, p4}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    return v1
.end method

.method public final uploadTextAndVideo(Lorg/json/JSONObject;)Z
    .locals 2

    .line 21
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 22
    invoke-virtual {v0, p1}, Lp8/d0;->z(Lorg/json/JSONObject;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public final uploadVideo(Ljava/lang/String;)Z
    .locals 3

    .line 26
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 27
    const-string v2, ""

    .line 28
    invoke-virtual {v0, v2, p1, v2, v2}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    return v1
.end method

.method public final uploadVideo(Lorg/json/JSONObject;)Z
    .locals 2

    .line 1
    invoke-static {}, Lbc/e;->q()Lp8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, ""

    .line 11
    .line 12
    invoke-virtual {v0, p1, p1, p1, p1}, Lp8/d0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lp8/d0;->z(Lorg/json/JSONObject;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    :goto_0
    const/4 v0, 0x1

    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    return v0

    .line 25
    :cond_1
    return v1
.end method

.method public final verifyUser(Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 2

    .line 1
    sget-object v0, Leb/k;->a:Leb/k;

    .line 2
    .line 3
    invoke-static {p3, p1, p2}, Leb/k;->p(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->s()Lg8/l;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, p3, v1}, Lg8/l;->c(Ljava/lang/String;Ljava/lang/String;II)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    const/4 p2, 0x1

    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    return p2

    .line 29
    :cond_0
    return v1
.end method

.method public final verifyUser(Ljava/lang/String;Ljava/lang/String;II)Z
    .locals 1

    .line 30
    sget-object v0, Leb/k;->a:Leb/k;

    invoke-static {p3, p1, p2}, Leb/k;->p(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 31
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->s()Lg8/l;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 33
    invoke-virtual {v0, p1, p2, p3, p4}, Lg8/l;->c(Ljava/lang/String;Ljava/lang/String;II)Z

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
