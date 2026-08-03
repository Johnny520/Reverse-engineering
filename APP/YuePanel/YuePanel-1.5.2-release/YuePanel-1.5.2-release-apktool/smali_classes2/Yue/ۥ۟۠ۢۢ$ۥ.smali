.class public final LYue/ۥ۟۠ۢۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/instrument/ClassFileTransformer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۢۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۟۠ۢۢ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥ۟۠ۢۢ$ۥ;

    invoke-direct {v0}, LYue/ۥ۟۠ۢۢ$ۥ;-><init>()V

    sput-object v0, LYue/ۥ۟۠ۢۢ$ۥ;->ۥ:LYue/ۥ۟۠ۢۢ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B
    .locals 0
    .param p1    # Ljava/lang/ClassLoader;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # Ljava/security/ProtectionDomain;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p5    # [B
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/security/ProtectionDomain;",
            "[B)[B"
        }
    .end annotation

    const-string p3, "kotlin/coroutines/jvm/internal/DebugProbesKt"

    invoke-static {p2, p3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object p2, LYue/ۥ۟۠ۢ۠;->ۥ:LYue/ۥ۟۠ۢ۠;

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, LYue/ۥ۟۠ۢ۠;->ۥ۟(Z)V

    const-string p2, "DebugProbesKt.bin"

    invoke-virtual {p1, p2}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣ۟ۥۣ;->ۥ۟۟۠۟(Ljava/io/InputStream;)[B

    move-result-object p1

    return-object p1
.end method
