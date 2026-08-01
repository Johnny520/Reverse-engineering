.class public final Llin/xposed/hook/view/main/itemview/UpdateLog;
.super Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016J\u0008\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Llin/xposed/hook/view/main/itemview/UpdateLog;",
        "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getLeftText",
        "",
        "getOnClick",
        "Landroid/view/View$OnClickListener;",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static final $stable:I = 0x8


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u545c\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static final getOnClick$lambda$0(Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p0, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/16 v0, 0x1a

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lio/ktor/client/plugins/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子世苏兰哲楪()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Llin/xposed/hook/view/main/itemview/UpdateLog;->getOnClick$lambda$0(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getLeftText()Ljava/lang/String;
    .locals 0

    .line 1
    const/16 p0, 0x54c

    .line 2
    .line 3
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getOnClick()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    new-instance p0, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-direct {p0, v0}, Llin/xposed/hook/javaplugin/dialog/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method
