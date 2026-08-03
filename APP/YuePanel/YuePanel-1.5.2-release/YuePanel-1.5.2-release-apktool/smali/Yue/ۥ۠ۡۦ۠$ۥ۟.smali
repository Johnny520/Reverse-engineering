.class public LYue/ۥ۠ۡۦ۠$ۥ۟;
.super LYue/ۥ۠ۡۦ۠$ۥ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۡۦ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۠ۡۦ۠$ۥ;-><init>(LYue/ۥ۠ۡۦ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ()Ljava/lang/ClassLoader;
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    return-object v0
.end method
