.class Llin/xposed/hook/util/qq/QQNTSendMsgUtils$3;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendMsg(Ljava/lang/Object;Ljava/util/ArrayList;Llin/xposed/hook/util/qq/IOperateCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Llin/xposed/hook/util/qq/IOperateCallback;


# direct methods
.method public constructor <init>(Llin/xposed/hook/util/qq/IOperateCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Llin/xposed/hook/util/qq/QQNTSendMsgUtils$3;->val$callback:Llin/xposed/hook/util/qq/IOperateCallback;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/xposed/hook/util/qq/QQNTSendMsgUtils$3;->val$callback:Llin/xposed/hook/util/qq/IOperateCallback;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    aget-object p1, p3, p1

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, 0x1

    .line 13
    aget-object p2, p3, p2

    .line 14
    .line 15
    check-cast p2, Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p0, p1, p2}, Llin/xposed/hook/util/qq/IOperateCallback;->onResult(ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method
