.class public final Lwh/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Li0/z;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/s;

.field public final synthetic b:Lwh/b;

.field public final synthetic c:Lgg/q;

.field public final synthetic d:Landroid/hardware/SensorManager;

.field public final synthetic e:Lwh/d;

.field public final synthetic f:Lgg/q;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/s;Lwh/b;Lgg/q;Landroid/hardware/SensorManager;Lwh/d;Lgg/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwh/e;->a:Landroidx/lifecycle/s;

    .line 5
    .line 6
    iput-object p2, p0, Lwh/e;->b:Lwh/b;

    .line 7
    .line 8
    iput-object p3, p0, Lwh/e;->c:Lgg/q;

    .line 9
    .line 10
    iput-object p4, p0, Lwh/e;->d:Landroid/hardware/SensorManager;

    .line 11
    .line 12
    iput-object p5, p0, Lwh/e;->e:Lwh/d;

    .line 13
    .line 14
    iput-object p6, p0, Lwh/e;->f:Lgg/q;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lwh/e;->a:Landroidx/lifecycle/s;

    .line 2
    .line 3
    iget-object v1, p0, Lwh/e;->b:Lwh/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/lifecycle/s;->f(Landroidx/lifecycle/p;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lwh/e;->c:Lgg/q;

    .line 9
    .line 10
    iget-boolean v1, v0, Lgg/q;->g:Z

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Lwh/e;->d:Landroid/hardware/SensorManager;

    .line 15
    .line 16
    iget-object v2, p0, Lwh/e;->e:Lwh/d;

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, v0, Lgg/q;->g:Z

    .line 23
    .line 24
    iget-object v0, p0, Lwh/e;->f:Lgg/q;

    .line 25
    .line 26
    iput-boolean v1, v0, Lgg/q;->g:Z

    .line 27
    .line 28
    :cond_0
    return-void
.end method
