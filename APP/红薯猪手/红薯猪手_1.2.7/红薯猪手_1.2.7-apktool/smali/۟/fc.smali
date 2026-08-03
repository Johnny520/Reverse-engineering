.class public final L۟/fc;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/ac;


# direct methods
.method public constructor <init>(L۟/ac;)V
    .locals 0

    iput-object p1, p0, L۟/fc;->ۥ:L۟/ac;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 6

    new-instance v0, L۟/p8;

    invoke-direct {v0}, L۟/p8;-><init>()V

    new-instance v1, L۟/p8;

    invoke-direct {v1}, L۟/p8;-><init>()V

    sget-object v2, L۟/q;->ۥ۟:L۟/kb;

    invoke-static {}, L۟/q$c;->ۥ۟۟()Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    iget-object v3, p0, L۟/fc;->ۥ:L۟/ac;

    new-instance v4, L۟/b5;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v0, v1, v5}, L۟/b5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method
