.class public final LD/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LD/d;

.field public final c:LA0/C;

.field public final d:LA0/C;

.field public e:Landroid/view/VelocityTracker;

.field public f:F

.field public g:I

.field public h:I

.field public i:I

.field public final j:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;LD/d;)V
    .locals 4

    new-instance v0, LA0/C;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LA0/C;-><init>(I)V

    new-instance v1, LA0/C;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LA0/C;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, -0x1

    iput v2, p0, LD/i;->g:I

    iput v2, p0, LD/i;->h:I

    iput v2, p0, LD/i;->i:I

    const v2, 0x7fffffff

    const/4 v3, 0x0

    filled-new-array {v2, v3}, [I

    move-result-object v2

    iput-object v2, p0, LD/i;->j:[I

    iput-object p1, p0, LD/i;->a:Landroid/content/Context;

    iput-object p2, p0, LD/i;->b:LD/d;

    iput-object v0, p0, LD/i;->c:LA0/C;

    iput-object v1, p0, LD/i;->d:LA0/C;

    return-void
.end method
