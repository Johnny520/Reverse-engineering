.class public Landroidx/room/MultiInstanceInvalidationService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field public ۥ:I

.field public final ۥ۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟:Landroidx/room/MultiInstanceInvalidationService$a;

.field public final ۥ۟۠:Landroidx/room/MultiInstanceInvalidationService$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ۥ:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ۥ۟:Ljava/util/HashMap;

    new-instance v0, Landroidx/room/MultiInstanceInvalidationService$a;

    invoke-direct {v0, p0}, Landroidx/room/MultiInstanceInvalidationService$a;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ۥ۟۟:Landroidx/room/MultiInstanceInvalidationService$a;

    new-instance v0, Landroidx/room/MultiInstanceInvalidationService$b;

    invoke-direct {v0, p0}, Landroidx/room/MultiInstanceInvalidationService$b;-><init>(Landroidx/room/MultiInstanceInvalidationService;)V

    iput-object v0, p0, Landroidx/room/MultiInstanceInvalidationService;->ۥ۟۠:Landroidx/room/MultiInstanceInvalidationService$b;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    iget-object p1, p0, Landroidx/room/MultiInstanceInvalidationService;->ۥ۟۠:Landroidx/room/MultiInstanceInvalidationService$b;

    return-object p1
.end method
