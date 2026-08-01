.class public final Landroidx/activity/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/a;


# instance fields
.field public final a:Landroidx/fragment/app/u;

.field public final synthetic b:Landroidx/activity/i;


# direct methods
.method public constructor <init>(Landroidx/activity/i;Landroidx/fragment/app/u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/h;->b:Landroidx/activity/i;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/h;->a:Landroidx/fragment/app/u;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/activity/h;->b:Landroidx/activity/i;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/activity/i;->b:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/activity/h;->a:Landroidx/fragment/app/u;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object v0, v1, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
