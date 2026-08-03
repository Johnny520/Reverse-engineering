.class public abstract Lcc;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    new-instance v0, LB2;

    invoke-direct {v0}, LB2;-><init>()V

    filled-new-array {v0}, [LB2;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v1, Lpo;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v0}, Lpo;-><init>(ILjava/lang/Object;)V

    new-instance v0, Lbb;

    invoke-direct {v0, v1}, Lbb;-><init>(Lyx;)V

    invoke-static {v0}, LAx;->I(Lyx;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcc;->a:Ljava/util/List;

    return-void

    :catchall_0
    move-exception v0

    new-instance v1, Ljava/util/ServiceConfigurationError;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/util/ServiceConfigurationError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
