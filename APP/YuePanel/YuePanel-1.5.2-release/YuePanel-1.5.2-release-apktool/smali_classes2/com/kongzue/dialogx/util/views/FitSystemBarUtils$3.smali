.class Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;
.super LYue/ۥۢۥۣۥ$ۥ۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->applyWindowInsets()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

.field final synthetic val$initialPadding:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;ILcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;)V
    .locals 0

    iput-object p1, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

    iput-object p3, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->val$initialPadding:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;

    invoke-direct {p0, p2}, LYue/ۥۢۥۣۥ$ۥ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public onEnd(LYue/ۥۢۥۣۥ;)V
    .locals 2
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

    const-string v1, "FitSystemBarUtils: setWindowInsetsAnimationCallback#onEnd "

    invoke-virtual {v0, v1}, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->log(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->access$102(Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;Z)Z

    invoke-super {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟;->onEnd(LYue/ۥۢۥۣۥ;)V

    return-void
.end method

.method public onPrepare(LYue/ۥۢۥۣۥ;)V
    .locals 2
    .param p1    # LYue/ۥۢۥۣۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

    iget-boolean v1, v0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->smoothPadding:Z

    invoke-static {v0, v1}, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->access$102(Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;Z)Z

    invoke-super {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟;->onPrepare(LYue/ۥۢۥۣۥ;)V

    return-void
.end method

.method public onProgress(LYue/ۥۢۥۦ;Ljava/util/List;)LYue/ۥۢۥۦ;
    .locals 2
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e5\u06e6;",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e2\u06e5\u06e6;"
        }
    .end annotation

    iget-object p2, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FitSystemBarUtils: setWindowInsetsAnimationCallback#onProgress: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->log(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->this$0:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;

    iget-boolean v0, p2, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->smoothPadding:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;

    iget-object v1, p0, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$3;->val$initialPadding:Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;

    invoke-direct {v0, v1}, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;-><init>(Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;)V

    invoke-static {p2, p1, v0}, Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;->access$000(Lcom/kongzue/dialogx/util/views/FitSystemBarUtils;LYue/ۥۢۥۦ;Lcom/kongzue/dialogx/util/views/FitSystemBarUtils$RelativePadding;)V

    :cond_0
    return-object p1
.end method
