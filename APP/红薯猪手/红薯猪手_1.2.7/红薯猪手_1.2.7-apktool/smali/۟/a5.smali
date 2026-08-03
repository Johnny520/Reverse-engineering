.class public final synthetic L۟/a5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥ:L۟/c5;

.field public final synthetic ۥ۟:D

.field public final synthetic ۥ۟۟:D


# direct methods
.method public synthetic constructor <init>(L۟/c5;DD)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/a5;->ۥ:L۟/c5;

    iput-wide p2, p0, L۟/a5;->ۥ۟:D

    iput-wide p4, p0, L۟/a5;->ۥ۟۟:D

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, L۟/a5;->ۥ:L۟/c5;

    iget-wide v1, p0, L۟/a5;->ۥ۟:D

    iget-wide v3, p0, L۟/a5;->ۥ۟۟:D

    const-string v5, "this$0"

    invoke-static {v5, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v0, L۟/c5;->ۥۡۦ:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "javascript:setMapCenter("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string v0, "mWebView"

    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method
