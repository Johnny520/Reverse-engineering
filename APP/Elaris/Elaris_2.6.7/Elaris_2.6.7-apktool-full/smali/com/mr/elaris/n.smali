.class public final Lcom/mr/elaris/n;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/n;->a:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/mr/elaris/n;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/mr/elaris/n;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/mr/elaris/n;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/n;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/mr/elaris/n;->d:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/mr/elaris/n;->a:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/mr/elaris/n;->b:Landroid/content/Context;

    .line 8
    .line 9
    invoke-static {v2, p0, v0, v1}, Lcom/mr/elaris/MessageRepeater;->x(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
