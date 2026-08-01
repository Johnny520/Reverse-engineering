.class final Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# instance fields
.field final synthetic $throwable:Ljava/lang/Throwable;

.field final synthetic this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;


# direct methods
.method public constructor <init>(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 2
    .line 3
    iput-object p2, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1;->$throwable:Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1;->this$0:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;

    .line 2
    .line 3
    invoke-static {v0}, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;->access$getWaitDialog$p(Llin/xposed/hook/javaplugin/online/upload/UploadPlugin;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, v0, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪苏兰哲:Z

    .line 9
    .line 10
    new-instance v1, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲楪苏兰;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, v0, v2}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世哲楪苏兰;-><init>(L飘花落叶言楪哲世兰子苏/飘花落叶言子世兰楪苏哲;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    const-wide v0, -0x36a57f8d051405a7L    # -2.3640354939326274E45

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object p0, p0, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1;->$throwable:Ljava/lang/Throwable;

    .line 29
    .line 30
    invoke-static {p0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0, v0}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲苏楪(Ljava/lang/CharSequence;Ljava/lang/String;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-wide v0, -0x36a54ec9051405a7L    # -2.3810278342071914E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;->INSTANCE:Llin/xposed/hook/javaplugin/online/upload/UploadPlugin$exceptionHandler$1$1$1;

    .line 48
    .line 49
    invoke-virtual {p0, v0, v1}, L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;->飘花落叶言子世兰哲楪苏(Ljava/lang/String;Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪苏兰哲世;)L飘花落叶言楪哲世兰子苏/飘花落叶言子世楪哲苏兰;

    .line 50
    .line 51
    .line 52
    return-void
.end method
