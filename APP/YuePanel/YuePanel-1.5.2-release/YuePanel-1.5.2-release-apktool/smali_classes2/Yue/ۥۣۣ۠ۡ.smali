.class public abstract LYue/ۥۣۣ۠ۡ;
.super LYue/ۥ۟ۧۦۨ;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۣ۠ۡ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥۣ۟۟۠:LYue/ۥۣۣ۠ۡ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣۣ۠ۡ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣۣ۠ۡ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣۣ۠ۡ;->ۥۣ۟۟۠:LYue/ۥۣۣ۠ۡ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۧۦۨ;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract close()V
.end method

.method public abstract ۥ۟۟ۧ۟()Ljava/util/concurrent/Executor;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method
