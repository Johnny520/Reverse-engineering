.class public LYue/ۥ۟ۢۡ۠$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۢۡ۠$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢۡ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# static fields
.field public static ۥ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06df\u06e2\u06e1\u06e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LYue/ۥ۟ۢۡ۠$ۥ۟;->ۥ:Ljava/lang/ThreadLocal;

    new-instance v0, LYue/ۥ۟ۢۡ۠;

    invoke-direct {v0}, LYue/ۥ۟ۢۡ۠;-><init>()V

    invoke-static {v0}, Ljava/net/Authenticator;->setDefault(Ljava/net/Authenticator;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public remove()V
    .locals 1

    sget-object v0, LYue/ۥ۟ۢۡ۠$ۥ۟;->ۥ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    return-void
.end method

.method public ۥ(LYue/ۥ۟ۢۡ۠;)LYue/ۥ۟ۢۡ۠;
    .locals 0

    sget-object p1, LYue/ۥ۟ۢۡ۠$ۥ۟;->ۥ:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۟ۢۡ۠;

    return-object p1
.end method

.method public ۥ۟(LYue/ۥۡۦۤۨ;Ljava/net/HttpURLConnection;)V
    .locals 1

    sget-object p2, LYue/ۥ۟ۢۡ۠$ۥ۟;->ۥ:Ljava/lang/ThreadLocal;

    new-instance v0, LYue/ۥ۟ۢۡ۠;

    invoke-direct {v0, p1}, LYue/ۥ۟ۢۡ۠;-><init>(LYue/ۥۡۦۤۨ;)V

    invoke-virtual {p2, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
