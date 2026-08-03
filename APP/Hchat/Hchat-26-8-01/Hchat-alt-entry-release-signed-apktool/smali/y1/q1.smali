.class public final Ly1/q1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ly1/p;

.field public b:I

.field public c:Z

.field public final d:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ly1/p;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ly1/q1;->a:Ly1/p;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iput p2, p0, Ly1/q1;->b:I

    .line 8
    .line 9
    new-instance p2, Landroid/view/GestureDetector;

    .line 10
    .line 11
    new-instance v0, Ly1/p1;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Ly1/p1;-><init>(Ly1/q1;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Ly1/q1;->d:Landroid/view/GestureDetector;

    .line 20
    .line 21
    return-void
.end method
