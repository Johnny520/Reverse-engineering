.class public final synthetic Lwh/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/lifecycle/o;


# instance fields
.field public final synthetic g:Lgg/q;

.field public final synthetic h:Landroid/hardware/SensorManager;

.field public final synthetic i:Lwh/d;

.field public final synthetic j:Landroid/hardware/Sensor;

.field public final synthetic k:Lgg/q;


# direct methods
.method public synthetic constructor <init>(Lgg/q;Landroid/hardware/SensorManager;Lwh/d;Landroid/hardware/Sensor;Lgg/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwh/b;->g:Lgg/q;

    .line 5
    .line 6
    iput-object p2, p0, Lwh/b;->h:Landroid/hardware/SensorManager;

    .line 7
    .line 8
    iput-object p3, p0, Lwh/b;->i:Lwh/d;

    .line 9
    .line 10
    iput-object p4, p0, Lwh/b;->j:Landroid/hardware/Sensor;

    .line 11
    .line 12
    iput-object p5, p0, Lwh/b;->k:Lgg/q;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Landroidx/lifecycle/q;Landroidx/lifecycle/k;)V
    .locals 3

    .line 1
    sget-object p1, Lwh/c;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p1, p1, p2

    .line 8
    .line 9
    iget-object p2, p0, Lwh/b;->g:Lgg/q;

    .line 10
    .line 11
    iget-object v0, p0, Lwh/b;->h:Landroid/hardware/SensorManager;

    .line 12
    .line 13
    iget-object v1, p0, Lwh/b;->i:Lwh/d;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-eq p1, v2, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq p1, v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-boolean p1, p2, Lgg/q;->g:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p2, Lgg/q;->g:Z

    .line 31
    .line 32
    iget-object p2, p0, Lwh/b;->k:Lgg/q;

    .line 33
    .line 34
    iput-boolean p1, p2, Lgg/q;->g:Z

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-boolean p1, p2, Lgg/q;->g:Z

    .line 38
    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Lwh/b;->j:Landroid/hardware/Sensor;

    .line 42
    .line 43
    invoke-virtual {v0, v1, p1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z

    .line 44
    .line 45
    .line 46
    iput-boolean v2, p2, Lgg/q;->g:Z

    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method
