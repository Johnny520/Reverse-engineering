.class public LYue/ۥ۟۟ۨ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟ۨ;->ۥۣ۟۟۟(Landroid/app/Activity;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroid/app/Application;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ$ۥ۟۟۟;


# direct methods
.method public constructor <init>(Landroid/app/Application;LYue/ۥ۟۟ۨ$ۥ۟۟۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۨ$ۥ۟;->ۥۣ۟۟۠:Landroid/app/Application;

    iput-object p2, p0, LYue/ۥ۟۟ۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ$ۥ۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۟ۨ$ۥ۟;->ۥۣ۟۟۠:Landroid/app/Application;

    iget-object v1, p0, LYue/ۥ۟۟ۨ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۨ$ۥ۟۟۟;

    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method
