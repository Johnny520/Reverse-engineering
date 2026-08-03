.class public final Landroidx/activity/OnBackPressedDispatcher$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/K2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/OnBackPressedDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:La/e7$a;

.field public final synthetic b:Landroidx/activity/OnBackPressedDispatcher;


# direct methods
.method public constructor <init>(Landroidx/activity/OnBackPressedDispatcher;La/e7$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/OnBackPressedDispatcher$c;->b:Landroidx/activity/OnBackPressedDispatcher;

    iput-object p2, p0, Landroidx/activity/OnBackPressedDispatcher$c;->a:La/e7$a;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, Landroidx/activity/OnBackPressedDispatcher$c;->b:Landroidx/activity/OnBackPressedDispatcher;

    iget-object v1, v0, Landroidx/activity/OnBackPressedDispatcher;->b:La/F1;

    iget-object v2, p0, Landroidx/activity/OnBackPressedDispatcher$c;->a:La/e7$a;

    invoke-virtual {v1, v2}, La/F1;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Landroidx/activity/OnBackPressedDispatcher;->c:La/Ub;

    invoke-static {v1, v2}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, La/e7$a;->a()V

    iput-object v3, v0, Landroidx/activity/OnBackPressedDispatcher;->c:La/Ub;

    :cond_0
    iget-object v0, v2, La/Ub;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, La/Ub;->c:La/S7;

    if-eqz v0, :cond_1

    invoke-interface {v0}, La/s7;->a()Ljava/lang/Object;

    :cond_1
    iput-object v3, v2, La/Ub;->c:La/S7;

    return-void
.end method
