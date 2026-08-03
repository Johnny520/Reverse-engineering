.class public final LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;


# instance fields
.field public final ۥ:Ljava/lang/Runnable;

.field public final ۥ۟:Ljava/util/concurrent/Executor;

.field public ۥ۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    sput-object v0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;->ۥ۟۟۟:LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;->ۥ:Ljava/lang/Runnable;

    iput-object p2, p0, LYue/ۥ۟۟ۢ۠$ۥ۟۟۟۟;->ۥ۟:Ljava/util/concurrent/Executor;

    return-void
.end method
