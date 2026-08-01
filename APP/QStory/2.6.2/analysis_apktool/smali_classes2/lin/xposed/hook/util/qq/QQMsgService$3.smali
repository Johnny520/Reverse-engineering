.class Llin/xposed/hook/util/qq/QQMsgService$3;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llin/xposed/hook/util/qq/QQMsgService;->getMultiMsg(Ljava/lang/Object;IILlin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$callback:Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;


# direct methods
.method public constructor <init>(Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Llin/xposed/hook/util/qq/QQMsgService$3;->val$callback:Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;

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
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    aget-object p1, p3, p1

    .line 3
    .line 4
    check-cast p1, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 p2, 0x1

    .line 11
    aget-object p2, p3, p2

    .line 12
    .line 13
    check-cast p2, Ljava/lang/String;

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    aget-object p3, p3, v0

    .line 17
    .line 18
    check-cast p3, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object p0, p0, Llin/xposed/hook/util/qq/QQMsgService$3;->val$callback:Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;

    .line 21
    .line 22
    invoke-interface {p0, p1, p2, p3}, Llin/xposed/hook/util/qq/QQMsgService$IGetMultiMsgCallback;->onResult(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method
