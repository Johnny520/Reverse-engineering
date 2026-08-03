.class public LYue/ۥ۟ۢۡ۠;
.super Ljava/net/Authenticator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۢۡ۠$ۥ;,
        LYue/ۥ۟ۢۡ۠$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:I = 0x5

.field public static ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;


# instance fields
.field public ۥ:LYue/ۥۡۦۤۨ;

.field public ۥ۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    const-string v0, "org.jsoup.helper.RequestAuthHandler"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥ۟ۢۡ۠$ۥ;

    sput-object v0, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    new-instance v0, LYue/ۥ۟ۢۡ۠$ۥ۟;

    invoke-direct {v0}, LYue/ۥ۟ۢۡ۠$ۥ۟;-><init>()V

    sput-object v0, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LYue/ۥ۟ۢۡ۠;->ۥ۟:I

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦۤۨ;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/net/Authenticator;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, LYue/ۥ۟ۢۡ۠;->ۥ۟:I

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۢۡ۠;->ۥ:LYue/ۥۡۦۤۨ;

    return-void
.end method


# virtual methods
.method public final getPasswordAuthentication()Ljava/net/PasswordAuthentication;
    .locals 5

    sget-object v0, LYue/ۥ۟ۢۡ۠;->ۥ۟۟۟:LYue/ۥ۟ۢۡ۠$ۥ;

    invoke-interface {v0, p0}, LYue/ۥ۟ۢۡ۠$ۥ;->ۥ(LYue/ۥ۟ۢۡ۠;)LYue/ۥ۟ۢۡ۠;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget v2, v0, LYue/ۥ۟ۢۡ۠;->ۥ۟:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, LYue/ۥ۟ۢۡ۠;->ۥ۟:I

    const/4 v3, 0x5

    if-le v2, v3, :cond_1

    return-object v1

    :cond_1
    iget-object v2, v0, LYue/ۥ۟ۢۡ۠;->ۥ:LYue/ۥۡۦۤۨ;

    if-nez v2, :cond_2

    return-object v1

    :cond_2
    new-instance v1, LYue/ۥۡۦۤۨ$ۥ;

    invoke-virtual {p0}, Ljava/net/Authenticator;->getRequestingURL()Ljava/net/URL;

    move-result-object v2

    invoke-virtual {p0}, Ljava/net/Authenticator;->getRequestorType()Ljava/net/Authenticator$RequestorType;

    move-result-object v3

    invoke-virtual {p0}, Ljava/net/Authenticator;->getRequestingPrompt()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, LYue/ۥۡۦۤۨ$ۥ;-><init>(Ljava/net/URL;Ljava/net/Authenticator$RequestorType;Ljava/lang/String;)V

    iget-object v0, v0, LYue/ۥ۟ۢۡ۠;->ۥ:LYue/ۥۡۦۤۨ;

    invoke-interface {v0, v1}, LYue/ۥۡۦۤۨ;->ۥ(LYue/ۥۡۦۤۨ$ۥ;)Ljava/net/PasswordAuthentication;

    move-result-object v0

    return-object v0
.end method
