.class public LYue/ۥۢۥۡۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۟ۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۥۡۢ;-><init>(Ljava/net/URI;LYue/ۥ۠۠۠۟;Ljava/util/Map;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥۢۥۡۢ;


# direct methods
.method public constructor <init>(LYue/ۥۢۥۡۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۥۡۢ$ۥ;->ۥ:LYue/ۥۢۥۡۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/net/URI;)Ljava/net/InetAddress;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    invoke-virtual {p1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p1

    return-object p1
.end method
