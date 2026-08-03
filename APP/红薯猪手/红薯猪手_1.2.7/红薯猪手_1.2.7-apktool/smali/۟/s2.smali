.class public final L۟/s2;
.super L۟/e;
.source "SourceFile"


# instance fields
.field public final ۥ۟۟:L۟/s2$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, L۟/e;-><init>()V

    new-instance v0, L۟/s2$a;

    invoke-direct {v0}, L۟/s2$a;-><init>()V

    iput-object v0, p0, L۟/s2;->ۥ۟۟:L۟/s2$a;

    return-void
.end method


# virtual methods
.method public final ۥ۟۠()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, L۟/s2;->ۥ۟۟:L۟/s2$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
