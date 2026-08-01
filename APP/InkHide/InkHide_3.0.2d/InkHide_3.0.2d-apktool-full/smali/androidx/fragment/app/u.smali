.class public final Landroidx/fragment/app/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/z;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/u;->c:I

    .line 5
    iput-object p1, p0, Landroidx/fragment/app/u;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/u;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Lf0/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/fragment/app/u;->c:I

    iput-object p1, p0, Landroidx/fragment/app/u;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p1}, Landroidx/fragment/app/u;-><init>(Z)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    iput-boolean p1, p0, Landroidx/fragment/app/u;->a:Z

    return-void
.end method
