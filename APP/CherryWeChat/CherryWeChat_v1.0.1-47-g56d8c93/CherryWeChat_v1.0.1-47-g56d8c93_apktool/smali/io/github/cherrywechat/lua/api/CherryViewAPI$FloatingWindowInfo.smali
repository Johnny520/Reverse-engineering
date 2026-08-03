.class final Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/github/cherrywechat/lua/api/CherryViewAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FloatingWindowInfo"
.end annotation


# instance fields
.field private final container:Landroid/widget/FrameLayout;

.field private final id:Ljava/lang/String;

.field private isShowing:Z

.field private final params:Landroid/view/WindowManager$LayoutParams;

.field private final windowManager:Landroid/view/WindowManager;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Z)V
    .locals 2

    const-wide v0, -0x1eff5fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1eff8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ef82fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ef89fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    iput-object p2, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    iput-object p4, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    iput-boolean p5, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;ZILjava/lang/Object;)Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->copy(Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Z)Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final component3()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public final component4()Landroid/view/WindowManager;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Z)Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;
    .locals 8

    const-wide v0, -0x1ef97fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1ef9afffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1efa4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1efabfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    invoke-direct/range {v2 .. v7}, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;-><init>(Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/WindowManager$LayoutParams;Landroid/view/WindowManager;Z)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    iget-object v3, p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    iget-boolean p1, p1, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getContainer()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public final getWindowManager()Landroid/view/WindowManager;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final isShowing()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    return v0
.end method

.method public final setShowing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x1efb9fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->id:Ljava/lang/String;

    const-wide v2, -0x1ee50fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->container:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1ee5dfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->params:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1ee67fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->windowManager:Landroid/view/WindowManager;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1ee78fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/github/cherrywechat/lua/api/CherryViewAPI$FloatingWindowInfo;->isShowing:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
