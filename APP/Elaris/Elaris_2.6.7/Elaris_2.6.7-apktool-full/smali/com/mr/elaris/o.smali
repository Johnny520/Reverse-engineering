.class public final Lcom/mr/elaris/o;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;

.field public final synthetic b:Lx9;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Lx9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/o;->a:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/mr/elaris/o;->b:Lx9;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/mr/elaris/o;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/mr/elaris/o;->b:Lx9;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/mr/elaris/MessageRepeater;->w(Ljava/lang/ClassLoader;Lx9;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
