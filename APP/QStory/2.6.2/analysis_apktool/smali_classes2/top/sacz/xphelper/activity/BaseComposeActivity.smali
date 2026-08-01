.class public abstract Ltop/sacz/xphelper/activity/BaseComposeActivity;
.super Landroidx/activity/ComponentActivity;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u00002\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ltop/sacz/xphelper/activity/BaseComposeActivity;",
        "Landroidx/activity/ComponentActivity;",
        "<init>",
        "()V",
        "Ljava/lang/ClassLoader;",
        "getClassLoader",
        "()Ljava/lang/ClassLoader;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "onRestoreInstanceState",
        "(Landroid/os/Bundle;)V",
        "onCreate",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u4e16\u5170\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
        "mLoader",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u696a\u4e16\u5170\u5b50\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
        "xphelper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final mLoader:L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世哲苏兰;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世哲苏兰;

    .line 5
    .line 6
    const-class v1, Ltop/sacz/xphelper/activity/BaseComposeActivity;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ltop/sacz/xphelper/activity/BaseComposeActivity;->mLoader:L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/sacz/xphelper/activity/BaseComposeActivity;->mLoader:L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    return-object p0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子苏楪世哲兰(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "android:viewHierarchyState"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Ltop/sacz/xphelper/activity/BaseComposeActivity;->mLoader:L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世哲苏兰;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
