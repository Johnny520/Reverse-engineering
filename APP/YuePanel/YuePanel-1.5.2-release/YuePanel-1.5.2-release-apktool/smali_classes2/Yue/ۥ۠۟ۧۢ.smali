.class public interface abstract LYue/ۥ۠۟ۧۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠۟ۧۢ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۠۟ۧۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:LYue/ۥ۠۟ۧۢ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LYue/ۥ۠۟ۧۢ$ۥ;->ۥ:LYue/ۥ۠۟ۧۢ$ۥ;

    sput-object v0, LYue/ۥ۠۟ۧۢ;->ۥ:LYue/ۥ۠۟ۧۢ$ۥ;

    new-instance v0, LYue/ۥ۠۟ۧۢ$ۥ$ۥ;

    invoke-direct {v0}, LYue/ۥ۠۟ۧۢ$ۥ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۠۟ۧۢ;->ۥ۟:LYue/ۥ۠۟ۧۢ;

    return-void
.end method


# virtual methods
.method public abstract ۥ(Ljava/lang/String;)Ljava/util/List;
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation
.end method
