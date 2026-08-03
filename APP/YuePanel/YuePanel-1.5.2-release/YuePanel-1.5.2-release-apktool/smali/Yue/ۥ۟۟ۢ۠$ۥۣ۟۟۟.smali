.class public final LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;


# instance fields
.field public volatile ۥ:Ljava/lang/Thread;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public volatile ۥ۟:LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;-><init>(Z)V

    sput-object v0, LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;->ۥ۟۟:LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object v0, LYue/ۥ۟۟ۢ۠;->ۥ۟۟ۡ:LYue/ۥ۟۟ۢ۠$ۥ۟;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, LYue/ۥ۟۟ۢ۠$ۥ۟;->ۥ۟۟۟۟(LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;Ljava/lang/Thread;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;)V
    .locals 1

    sget-object v0, LYue/ۥ۟۟ۢ۠;->ۥ۟۟ۡ:LYue/ۥ۟۟ۢ۠$ۥ۟;

    invoke-virtual {v0, p0, p1}, LYue/ۥ۟۟ۢ۠$ۥ۟;->ۥ۟۟۟(LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;)V

    return-void
.end method

.method public ۥ۟()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;->ۥ:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥ۟۟ۢ۠$ۥۣ۟۟۟;->ۥ:Ljava/lang/Thread;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
